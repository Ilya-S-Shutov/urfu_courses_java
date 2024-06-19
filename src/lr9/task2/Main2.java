package src.lr9.task2;

import java.util.Scanner;

public class Main2 {
    public static void binNum(int num) {
        int nextDivider = num / 2;
        int rest = num % 2;
        if (nextDivider != 0) {
            binNum(nextDivider);
        }
        System.out.print(rest);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число для перевода: ");
        int num = in.nextInt();
        System.out.print("Двоичное представление числа: ");
        binNum(num);
    }

}

/*
Создать приложение с использованием рекурсии для перевода целого числа,
введенного с клавиатуры, в двоичную систему счисления
 */