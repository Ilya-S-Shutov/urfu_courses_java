package src.lr1;

import java.util.Scanner;

public class Example21_16 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");
        int b = in.nextInt();
        int a = b - 1;
        int c = b + 1;
        double d = Math.pow(a + b + c, 2);

        System.out.printf("\nNumbers: %d, %d, %d, %d", a, b, c, (int)d);

    }
}