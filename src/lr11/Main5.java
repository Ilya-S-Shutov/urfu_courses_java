package src.lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Main5 {
    public static void main(String[] args) {
        String string = "Мама мыла раму, мадаму и чемодаму!";
        List<String> stringList = List.of(string.split(" "));
        String substring = "аму";
        List<String> newStringList = func5(stringList, substring);

        System.out.println(newStringList);

    }

    public static List<String> func5(List<String> strList, String subStr) {
        return strList.stream()
                .filter(str -> str.contains(subStr))
                .collect(Collectors.toList());
    }
}


/*
5.	Напишите функцию, которая принимает на вход список строк и возвращает
 новый список, содержащий только те строки, которые содержат заданную подстроку.
 */