package src.lr1;

import java.util.Scanner;

public class Example21_10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input day of a week: ");
        String day = in.nextLine();

        System.out.print("Input month: ");
        String month = in.nextLine();

        System.out.print("Input date: ");
        String date = in.nextLine(); // Дата целенаправлено задаётся строкой, т.к. в рамках задачи с ней не предполагается численных операций

        System.out.printf("\nCurrent date: %s, %s %s", day, date, month);

    }
}