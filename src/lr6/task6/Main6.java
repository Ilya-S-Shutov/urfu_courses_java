package src.lr6.task6;


import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
        System.out.printf("Дан массив: %s\n", Arrays.toString(myArray));
        System.out.print("Введите число: ");
        int num = in.nextInt();
        System.out.printf("Новый массив: %s\n", Arrays.toString(Task6.getArraysPart(myArray, num)));
    }
}
