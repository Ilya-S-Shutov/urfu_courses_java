package src.lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        String string = "Очень большая И СТрашная строка! Ага ага";
        List<String> stringList = List.of(string.split(" "));

        List<String> newList = func3(stringList);
        newList.stream().forEach(
                str -> System.out.print(str + " ")
        );
    }

    public static List<String> func3(List<String> strList) {
        return strList.stream()
                .filter(str -> Character.isUpperCase(str.charAt(0)))
                .collect(Collectors.toList());
    }
}

/*
3.	Напишите функцию, которая принимает на вход список строк и
возвращает новый список, содержащий только те строки, которые начинаются с большой буквы.
 */