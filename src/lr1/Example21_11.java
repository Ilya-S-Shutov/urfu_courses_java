package src.lr1;

import java.util.Scanner;

public class Example21_11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.print("Input month: ");
        String month = in.nextLine();

        System.out.print("Input amount of days: ");
        String days = in.nextLine(); // Кол-во целенаправлено задаётся строкой, т.к. в рамках задачи с ней не предполагается численных операций

        System.out.printf("\nMonth %s contains %s", month, days);

    }
}