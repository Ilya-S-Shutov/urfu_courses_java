package src.lr2;

import java.util.Scanner;

public class Example23_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = in.nextInt();

        if (num % 4 == 0 && num >= 10) {
            System.out.printf("%d is a good number!", num);
        } else {
            System.out.print("Try harder...");
        }
    }
}
