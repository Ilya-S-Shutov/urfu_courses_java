package src.lr4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Укажите высоту треугольника: ");
        int lvls = in.nextInt();
        int rowSize = 2;

        for (int i = 0; i < lvls; i++) {
            for (int j = 1; j <= rowSize; j++) {
                if (j == 1) {
                    System.out.print("|");
                } else if (j == rowSize) {
                    System.out.println("\\");
                } else if (i == lvls - 1) {
                    System.out.print("_");
                } else {
                    System.out.print(" ");
                }
            }
            rowSize++;
        }
    }
}


/*
2. Напишите программу, которая выводит в консольное окно
прямоугольный треугольник;
 */