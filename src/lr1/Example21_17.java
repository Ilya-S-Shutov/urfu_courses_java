package src.lr1;

import java.util.Scanner;

public class Example21_17 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int a = in.nextInt();

        System.out.print("Input second number: ");
        int b = in.nextInt();

        System.out.printf("\nSum: %d\nDiff: %d", a + b, a - b);

    }
}