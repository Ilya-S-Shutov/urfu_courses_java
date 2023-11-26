package src.lr6.task9;

public class Task9 {

    public static void reverse(char[] chars) {
        for (int i = 0; i < Math.ceil((double) chars.length / 2); i ++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
    }

}


/*
9.	Напишите программу со статическим методом,
аргументом которому передается одномерный символьный массив.
В результате вызова метода элементы массива попарно меняются местами:
первый — с последним, второй — с предпоследним и так далее.
 */