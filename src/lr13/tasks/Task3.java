package src.lr13.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {

            System.out.print("Input size of a array: ");
            int size = in.nextInt();
            byte[] array = new byte[size];

            System.out.print("Input arrays items: ");
            for (int i = 0; i < size; i++) {
                array[i] = in.nextByte();
            }

            int sum = 0;
            for (byte b : array) {
                sum += b;
            }

            System.out.printf("Summ of arrays items: %d\n", sum);

        } catch (InputMismatchException e) {
            System.out.println("Error: input was not-a-number or out of bounds types \"byte\".");
        }
    }
}
