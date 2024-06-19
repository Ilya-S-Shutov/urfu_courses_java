package src.lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Main9 {
    public static void main(String[] args) {
        List<String> stringList = List.of("1234", "asfasfas", "asdAD!231", "ASd!.,>,.", "12345.>/.,/90", "JAlasdKJa");
        List<String> newStringList = func9(stringList);

        System.out.println(newStringList);

    }

    public static List<String> func9(List<String> strList) {
        return strList.stream()
                .filter(str -> str.matches("^[a-zA-Zа-яА-Я]+$"))
                .collect(Collectors.toList());
    }
}

/*
9.	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
содержащий только те строки, которые содержат только буквы (без цифр и символов).
 */