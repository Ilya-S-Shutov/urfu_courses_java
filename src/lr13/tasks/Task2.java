package src.lr13.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
                };

        try {
            System.out.println("Col num:");
            int column = in.nextInt();

            if(column < 0 || column >= matrix[0].length) {
                throw new ArrayIndexOutOfBoundsException("Column does not exist.");
            }

            System.out.printf("Column %d: \n", column);
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][column]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: input must be Integer!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Error: %s\n", e.getMessage());
        }
    }
}
