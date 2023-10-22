package src.lr2;

import java.util.Scanner;

public class Example23_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = in.nextInt();

        if (num % 3 == 0) {
            System.out.printf("Number %d can be divided by 3", num);
        } else {
            System.out.printf("Number %d cannot be divided by 3", num);
        }
    }
}
