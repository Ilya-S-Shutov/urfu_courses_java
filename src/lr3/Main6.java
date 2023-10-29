package src.lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length;

        System.out.print("Введите размер массива: ");
        do {
        length = in.nextInt();
        if (length < 0) {
            System.out.print("Ошибка! Введите корректное значение: ");
        }
        } while (length < 0);

        int[] numArray = new int[length];

        for (int i = 0; i < length; i++) {
            numArray[i] = 5*i + 2;
        }
        System.out.printf("Результирующий массив: %s\n", Arrays.toString(numArray));
    }
}


/*
6. Напишите программу, в которой создается одномерный числовой
массив и заполняется числами, которые при делении на 5 дают в остатке 2
(числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
Предусмотреть обработку ошибки, связанной с вводом некорректного
значения.
 */