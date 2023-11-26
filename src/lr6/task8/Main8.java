package src.lr6.task8;

import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.printf("Исходный массив: %s\nСреднее арифметическое: %s\n",
                Arrays.toString(intArray),
                Task8.getMean(intArray));

    }
}
