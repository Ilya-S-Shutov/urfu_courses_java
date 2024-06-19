package XMLParser;



import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;

import java.io.File;
import java.util.Scanner;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class XMLParser {
    public static void main(String[] args) {
        startActions();
        try {
            String title;
            String teacherName;
            File inputFile = new File("src/lr10/src/main/java/XMLParser/myXML.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            System.out.printf("Root: %s\n", doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("lesson");
            Scanner in = new Scanner(System.in);
            String action = "";
            while (!action.equals("5")) {
                System.out.println("Choose action:\n1) Find lessons by title\n2) Find lessons by teacher\n3) Register new lesson\n4) Remove lesson\n5) Exit");
                action = in.nextLine();
                switch (action) {

                    case "1":
                        System.out.print("Input title: ");
                        title = in.nextLine();
                        findLessons(title, true, nodeList);
                        break;

                    case "2":
                        System.out.print("Input teachers name: ");
                        teacherName = in.nextLine();
                        findLessons(teacherName, false, nodeList);
                        break;

                    case "3":
                        System.out.print("Input title: ");
                        title = in.nextLine();
                        System.out.print("Input teachers name: ");
                        teacherName = in.nextLine();
                        addLesson(doc, title, teacherName);
                        break;

                    case "4":
                        System.out.print("Input title: ");
                        title = in.nextLine();
                        System.out.print("Input teachers name: ");
                        teacherName = in.nextLine();
                        removeLesson(doc, title, teacherName);
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void findLessons(String xmlElement, boolean isTitle, NodeList nodeList) {
        System.out.println("Your lessons:");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            Element element = (Element) node;
            String title = element.getElementsByTagName("title")
                    .item(0)
                    .getTextContent();
            String teacherName = element.getElementsByTagName("teacher")
                    .item(0)
                    .getTextContent();

            if (node.getNodeType() == Node.ELEMENT_NODE && xmlElement.equals(title) && isTitle) {
                System.out.printf("\tLesson title: %s\n\tTeacher: %s\n", title, teacherName);
            } else if (node.getNodeType() == Node.ELEMENT_NODE && xmlElement.equals(teacherName) && !isTitle) {
                System.out.printf("\tLesson title: %s\n\tTeacher: %s\n", title, teacherName);
            }
        }
    }

    public static void addLesson(Document doc, String lessonTitle, String teacherName) {
        Element lesson = doc.createElement("lesson");
        Element rootElement = (Element) doc.getElementsByTagName("LessonsList").item(0);
        rootElement.appendChild(lesson);

        Element title = doc.createElement("title");
        title.appendChild(doc.createTextNode(lessonTitle));
        lesson.appendChild(title);

        Element teacher = doc.createElement("teacher");
        teacher.appendChild(doc.createTextNode(teacherName));
        lesson.appendChild(teacher);
    }

    public static void removeLesson(Document doc, String lessonTitle, String teacherName) {
        NodeList nodeList = doc.getElementsByTagName("lesson");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element lesson = (Element) nodeList.item(i);
            String title = lesson.getElementsByTagName("title")
                    .item(0)
                    .getTextContent();
            String teacher = lesson.getElementsByTagName("title")
                    .item(0)
                    .getTextContent();
            if (title.equals(lessonTitle) && teacher.equals(teacherName)) {
                lesson.getParentNode().removeChild(lesson);
            }
        }
    }

    public static void startActions() {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("LessonsList");
            doc.appendChild(rootElement);

            addLesson(doc, "Math", "Ivan Ivanov");
            addLesson(doc, "Java dev", "Nikolay Arkhipov");
            addLesson(doc, "English", "Pyotr Petrov");

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory transFactory = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = transFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File("src/lr10/src/main/java/XMLParser/myXML.xml"));
            transformer.transform(source, result);

            System.out.println("XML file was created!");
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}
