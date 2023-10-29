package src.lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Сколько чисел складываем? ");
        int length = in.nextInt();
        int[] numsArray = new int[length];

//    Цикл for
        System.out.println("Работа через цикл for:");
        for (int i = 0; i < length; ) {
            System.out.printf("\nВведите число %d: ", i+1);
            int num = in.nextInt();

            if (num % 5 == 2 || num % 3 == 1) {
                numsArray[i] = num;
                i++;
            } else {
                System.out.println("Данное число не будет учтено, т.к. не соответствует условию!");
            }
        }
        System.out.printf("\nНабор чисел: %s\nСумма: %d\n", Arrays.toString(numsArray), Arrays.stream(numsArray).sum());

//  Цикл while:
        System.out.println("Работа через цикл while:");
        int i = 0;
        while (i < length) {
            System.out.printf("\nВведите число %d: ", i+1);
            int num = in.nextInt();

            if (num % 5 == 2 || num % 3 == 1) {
                numsArray[i] = num;
                i++;
            } else {
                System.out.println("Данное число не будет учтено, т.к. не соответствует условию!");
            }
        }
        System.out.printf("\nНабор чисел: %s\nСумма: %d\n", Arrays.toString(numsArray), Arrays.stream(numsArray).sum());

    }
}

/*
5. Напишите программу, в которой вычисляется сумма чисел, удовлетворяющих таким критериям:
при делении числа на 5 в остатке получается 2, или при делении на 3 в остатке получается 1.
Количество чисел в сумме вводится пользователем. Программа отображает числа, которые суммируются, и значение суммы.
Предложите версии программы, использующие разные операторы цикла.
 */