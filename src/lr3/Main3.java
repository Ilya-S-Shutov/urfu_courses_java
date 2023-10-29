package src.lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите кол-во чисел в последовательности: ");

        int length = in.nextInt();
        int[] fibArray = new int[length];

//  Цикл for:
//        for (int i = 0; i < length; i++) {
//            if (i == 0 || i == 1) {
//                fibArray[i] = 1;
//            } else {
//                fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
//            }
//
//        }
//  Цикл while:
        int i = 0;
        while (i < length) {
            if (i == 0 || i == 1) {
                fibArray[i] = 1;
            } else {
                fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
            }
            i++;
        }

//  Печать результата:
        System.out.printf("Последовательность Фибоначчи: %s", Arrays.toString(fibArray));

    }
}



/*
3. Напишите программу, которая выводит последовательность чисел
Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
следующее число равно сумме двух предыдущих
(получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
в последовательности вводится пользователем. Предложите версии
программы, использующие разные операторы цикла.
 */