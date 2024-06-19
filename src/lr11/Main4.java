package src.lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the List: ");
        int size = in.nextInt();
        List<Integer> numList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            numList.add(rand.nextInt(100));
        }
        System.out.print("First List: ");
        numList.stream().forEach(x -> System.out.printf("%d ", x));

        List<Integer> newList = func4(numList);
        System.out.print("\nNew array: ");
        newList.stream().forEach(x -> System.out.printf("%d ", x));
    }

    public static List<Integer> func4(List<Integer> numList) {
        return numList.stream()
                .map(x -> x*x)
                .collect(Collectors.toList());
    }
}

/*
4.	Напишите функцию, которая принимает на вход список чисел и
 возвращает новый список, содержащий квадраты этих чисел.
 */