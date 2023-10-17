package src.lr1;

import java.time.Year;
import java.util.Scanner;

public class Example21_13 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input your name: ");
        String name = in.nextLine();

        System.out.print("Input your year of birth: ");
        int year = in.nextInt();

        int age = Year.now().getValue() - year;

        System.out.printf("\nName: %s\nCurrent age: %d or %d",name, age - 1, age);

    }
}