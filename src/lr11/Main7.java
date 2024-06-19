package src.lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Main7 {
    public static void main(String[] args) {
        List<String> stringList = List.of("1234", "12345", "123456", "1", "1234567890");
        int length = 5;
        List<String> newStringList = func7(stringList, length);

        System.out.println(newStringList);

    }

    public static List<String> func7(List<String> strList, int subStr) {
        return strList.stream()
                .filter(str -> str.length() > 5)
                .collect(Collectors.toList());
    }
}

/*
7.	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
содержащий только те строки, которые имеют длину больше заданного значения.
 */