package src.lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int first = in.nextInt();

        System.out.print("Введите второе число: ");
        int second = in.nextInt();

        int start = Math.min(first, second);
        int finish = Math.max(first, second);

        int[] numbers = new int[Math.abs(start - finish) + 1];
//    Цикл for
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = start + i;
        }

        System.out.printf("Результат через цикл for: %s\n", Arrays.toString(numbers));

//  Цикл while:
        int i = 0;
        while (i < numbers.length) {
            numbers[i] = start + i++;
        }
        System.out.printf("Результат через цикл while: %s", Arrays.toString(numbers));
    }
}

/*
4. Напишите программу, в которой пользователем вводится два
целых числа. Программа выводит все целые числа — начиная с наименьшего
(из двух введенных чисел) и заканчивая наибольшим (из двух введенных
чисел). Предложите разные версии программы (с использованием разных
операторов цикла).
 */