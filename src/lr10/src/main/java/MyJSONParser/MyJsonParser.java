package MyJSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class MyJsonParser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String title;
        String teacherName;
        createNewJson();
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr10/src/main/java/JSONParser/myJSON.json"));
            JSONObject lessons = (JSONObject) obj;
            String action = "";
            while (!action.equals("5")) {
                System.out.println("Choose action:\n1) Find lessons by title\n2) Find lessons by teacher\n3) Register new lesson\n4) Remove lesson\n5) Exit");
                action = in.nextLine();
                switch (action) {

                    case "1":
                        System.out.print("Input title: ");
                        title = in.nextLine();
                        findLessonsByTitle(title, lessons);
                        break;

                    case "2":
                        System.out.print("Input teachers name: ");
                        teacherName = in.nextLine();
                        findLessonsByTeacher(teacherName, lessons);
                        break;

                    case "3":
                        System.out.print("Input title: ");
                        title = in.nextLine();
                        System.out.print("Input teachers name: ");
                        teacherName = in.nextLine();
                        addLesson(lessons, title, teacherName);
                        break;

                    case "4":
                        System.out.print("Input title: ");
                        title = in.nextLine();
                        System.out.print("Input teachers name: ");
                        teacherName = in.nextLine();
                        removeLesson(lessons, title, teacherName);
                        break;
                }
            }

        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    public static void addLesson(JSONObject lessonsObject, String lessonTitle, String teacherName) {
        JSONArray lessonsArray = (JSONArray) lessonsObject.get("lessons");
        JSONObject newLesson = new JSONObject();
        newLesson.put("title", lessonTitle);
        newLesson.put("teacher", teacherName);
        lessonsArray.add(newLesson);
    }

    public static void findLessonsByTitle(String searchingTitle, JSONObject lessons) {
        JSONArray jsonArray = (JSONArray) lessons.get("lessons");
//        jsonArray.stream()
//                .filter(lesson -> lesson instanceof JSONObject)
//                .map(lesson -> (JSONObject) lesson)
//                .filter(lesson -> searchingTitle.equals(lesson.get("title")))
//                .forEach(lesson -> {
//                    System.out.println("\nТекущий элемент: lesson");
//                    System.out.printf("\tTitle: %s", lesson.get("title"));
//                    System.out.println("\tTeacher: %s", lesson.get("teacher"));
//                });

    }

    public static void findLessonsByTeacher(String searchingTeacher, JSONObject lessons) {
        JSONArray jsonArray = (JSONArray) lessons.get("lessons");
//        jsonArray.stream()
//                .filter(lesson -> lesson instanceof JSONObject)
//                .map(lesson -> (JSONObject) lesson)
//                .filter(lesson -> searchingTeacher.equals(lesson.get("teacher")))
//                .forEach(lesson -> {
//                    System.out.println("\nТекущий элемент: lesson");
//                    System.out.printf("\tTitle: %s", lesson.get("title"));
//                    System.out.println("\tTeacher: %s", lesson.get("teacher"));
//                });

    }

    public static void removeLesson(JSONObject lessons, String lessonTitle, String teacherName) {
        JSONArray jsonArray = (JSONArray) lessons.get("books");
        String title = "Название книги";
        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();
            if (title.equals(book.get("title"))) {
                iterator.remove();
            }}

    }

    public static void createNewJson() {
        JSONObject lessons = new JSONObject();
        addLesson(lessons, "Qwerty!", "Ivan");

        try (FileWriter file = new FileWriter("src/lr10/src/main/java/JSONParser/myJSON.json")) {
            file.write(lessons.toJSONString());
            System.out.println("JSON file was created!");
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}


