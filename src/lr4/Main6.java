package src.lr4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите изначальное кол-во строк: ");
        int rows = in.nextInt();
        System.out.print("Введите изначальное кол-во столбцов: ");
        int columns = in.nextInt();

        int delRow = random.nextInt(0, rows);
        int delCol = random.nextInt(0, columns);

        int[][] numArray = new int[rows][columns];
        int[][] newNumArray = new int[rows-1][columns-1];
        int newJ, newI;

        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                numArray[i][j] = random.nextInt(20);
            }
        }

        newI = 0;
        for (int i = 0; i < numArray.length; i++) {
            newJ = 0;
            if (i == delRow) {
                continue;
            }
            for (int j = 0; j < numArray[i].length; j++) {
                if (j == delCol) {
                    continue;
                }
                newNumArray[newI][newJ++] = numArray[i][j];
            }
            newI++;

        }

        System.out.printf("Исходный массив:\n%s\n",
                Arrays.deepToString(numArray).replace("], ", "]\n")
        );

        System.out.printf("\nМассив с удалёнными %d строкой и %d столбцом (отсчёт с 0):\n%s\n", delRow, delCol,
                Arrays.deepToString(newNumArray).replace("], ", "],\n")
        );
    }
}

/*
6. Напишите программу, в которой создается и инициализируется
двумерный числовой массив. Затем из этого массива удаляется строка и
столбец (создается новый массив, в котором по сравнению с исходным
удалена одна строка и один столбец). Индекс удаляемой строки и индекс
удаляемого столбца определяется с помощью генератора случайных чисел.

 */