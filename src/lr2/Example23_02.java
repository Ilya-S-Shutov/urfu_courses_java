package src.lr2;

import java.util.Scanner;

public class Example23_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = in.nextInt();

        if (num % 5 == 2 && num % 7 == 1) {
            System.out.printf("%d is a right number!", num);
        } else {
            System.out.printf("%d is a wrong number!", num);
        }
    }
}
