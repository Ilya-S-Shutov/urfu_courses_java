package src.lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the list: ");
        int size = in.nextInt();
        List<Integer> numList = new ArrayList<>();
        Random rand = new Random();
        int denominator = 3;

        for (int i = 0; i < size; i++) {
            numList.add(rand.nextInt(100));
        }

        System.out.println("First list:");
        System.out.println(numList);
        List<Integer> newList = func6(numList, denominator);
        System.out.println("Second list:");
        System.out.println(newList);
    }

    public static List<Integer> func6(List<Integer> numList, int denom) {
        return numList.stream()
                .filter(x -> x % denom == 0)
                .collect(Collectors.toList());
    }
}

/*
Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
содержащий только те числа, которые делятся на заданное число без остатка.
 */