package src.lr2;

import java.util.Scanner;

public class Example23_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        double num = in.nextDouble();

        if (5 <= num && num <= 10) {
            System.out.print("Your number is in range.");
        } else {
            System.out.print("Your number is out of range.");
        }
    }
}
