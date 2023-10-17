package src.lr1;

import java.time.Year;
import java.util.Scanner;

public class Example21_14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input your age: ");
        int age = in.nextInt();

        int year = Year.now().getValue() - age;

        System.out.printf("\nYear of birth: %d or %d", year - 1, year);

    }
}