package src.lr1;

import java.util.Scanner;

public class Example21_08 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input surname: ");
        String surname = in.nextLine();

        System.out.print("Input name: ");
        String name = in.nextLine();

        System.out.print("Input middle name: ");
        String middleName = in.nextLine();

        System.out.printf("Hello, %s %s %s", surname, name, middleName);
    }
}