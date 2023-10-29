package src.lr3;

import java.util.Arrays;
import java.util.Random;

public class Main10 {
    public static void main(String[] args) {
        Random random = new Random();
        int length = 10;
        int[] numArray = new int[length];

        for (int i = 0; i < length; i++) {
            numArray[i] = random.nextInt(100);
        }

        System.out.printf("Исходный массив: %s\n", Arrays.toString(numArray));

        for (int i = length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (numArray[j] < numArray[j + 1]) {
                    int temp = numArray[j];
                    numArray[j] = numArray[j + 1];
                    numArray[j + 1] = temp;
                }
            }
        }

        System.out.printf("Массив, отсортированный в обратном порядке: %s", Arrays.toString(numArray));


    }

}

/*
10. Напишите программу, в которой создается целочисленный
массив, заполняется случайными числами и после этого значения элементов в
массиве сортируются в порядке убывания значений.
 */