package src.lr11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = in.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            arr1[i] = rand.nextInt(50);
            arr2[i] = rand.nextInt(50);
        }

        System.out.printf("First array: %s\n", Arrays.toString(arr1));
        System.out.printf("Second array: %s\n", Arrays.toString(arr2));
        int[] newArr = func2(arr1, arr2);
        System.out.printf("New array: %s\n", Arrays.toString(newArr));
    }

    public static int[] func2(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).filter(
                x -> Arrays.stream(arr2).anyMatch(y -> x == y)
        ).toArray();
    }
}


/*
2.	Напишите функцию, которая принимает на вход два массива целых чисел и возвращает новый массив,
 содержащий только те элементы, которые есть в обоих массивах.
 */