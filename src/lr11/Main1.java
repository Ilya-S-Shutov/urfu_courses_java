package src.lr11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);
        }

        System.out.printf("First array: %s\n", Arrays.toString(arr));
        int[] newArr = func1(arr);
        System.out.printf("New array: %s\n", Arrays.toString(newArr));
    }

    public static int[] func1(int[] arr) {
        return Arrays.stream(arr).filter(
                x -> x % 2 == 0
        ).toArray();
    }
}

/*
1.	Напишите функцию, которая принимает на вход массив целых чисел и
возвращает новый массив, содержащий только четные числа из исходного массива.
 */