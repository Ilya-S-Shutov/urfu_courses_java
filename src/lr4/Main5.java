package src.lr4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите изначальное кол-во строк: ");
        int rows = in.nextInt();
        System.out.print("Введите изначальное кол-во столбцов: ");
        int columns = in.nextInt();


        int[][] numArray = new int[rows][columns];
        int[][] newNumArray = new int[columns][rows];

        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                numArray[i][j] = random.nextInt(20);
            }
        }

        for (int i = 0; i < newNumArray.length; i++) {
            for (int j = 0; j < newNumArray[i].length; j++) {
                newNumArray[i][j] = numArray[j][i];
            }
        }

        System.out.printf("Исходный массив:\n%s\n",
                Arrays.deepToString(numArray).replace("], ", "],\n")
        );

        System.out.printf("\nТранспонированный массив:\n%s\n",
                Arrays.deepToString(newNumArray).replace("], ", "],\n")
        );



    }
}


/*
5. Напишите программу, в которой создается двумерный целочисленный
массив. Он заполняется случайными числами. Затем в этом массиве строи и
столбцы меняются местами: первая строка становится первым столбцом,
вторая строка становиться вторым столбцом и так далее. Например, если
исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
из 5 строк и 3 столбцов.

 */