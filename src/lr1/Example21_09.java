package src.lr1;

import java.util.Scanner;

public class Example21_09 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = in.nextLine();

        System.out.print("Input age: ");
        int age = in.nextInt();

        System.out.printf("\nYour name: %s\nYour age: %d", name, age);

    }
}