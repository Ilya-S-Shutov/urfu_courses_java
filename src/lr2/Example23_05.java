package src.lr2;

import java.util.Scanner;

public class Example23_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = in.nextInt();

        int result = num / 1000 % 10;

        System.out.printf("Result: %d", result);

    }
}
