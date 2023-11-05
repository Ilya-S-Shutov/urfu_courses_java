package src.lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер внешнего массива: ");
        int outside = in.nextInt();
        System.out.print("Введите размер внутренних массивов: ");
        int inside = in.nextInt();

        int[][] mainArray = new  int[outside][inside];

        for (int i = 0; i < outside; i++) {
            for (int j = 0; j < inside; j++) {
                mainArray[i][j] = 2;
            }
        }

        for (int[] insideItem : mainArray) {
            System.out.println(Arrays.toString(insideItem));
        }
    }
}

/*
3. Напишите программу, в которой создается двумерный массив, который
выводи прямоугольник из цифр 2;

 */