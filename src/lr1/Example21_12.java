package src.lr1;

import java.time.Year;
import java.util.Scanner;

public class Example21_12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Year of birth: ");
        int year = in.nextInt();

        int age = Year.now().getValue() - year;

        System.out.printf("\nCurrent age: %d or %d", age - 1, age);

    }
}