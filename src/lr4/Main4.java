package src.lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите высоту треугольника: ");
        int h = in.nextInt();

        char[][] triangle = new char[h][h];

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle.length; j++) {
                if (j <= i) {
                    triangle[i][j] = '*';
                } else {
                    triangle[i][j] = ' ';
                }
            }
        }


        System.out.println(
                Arrays.deepToString(triangle).replace("]", "\n").replaceAll("[\\[, ]", "")
        );

    }
}

/*
4. Напишите программу, в которой создается двумерный массив, который
выводит прямоугольный треугольник;
 */