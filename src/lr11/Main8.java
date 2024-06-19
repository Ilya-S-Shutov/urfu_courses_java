package src.lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 15;
        List<Integer> numList = new ArrayList<>();
        Random rand = new Random();
        int limit = 50;

        for (int i = 0; i < size; i++) {
            numList.add(rand.nextInt(100));
        }

        System.out.println("First list:");
        System.out.println(numList);
        List<Integer> newList = func8(numList, limit);
        System.out.println("Second list:");
        System.out.println(newList);
    }

    public static List<Integer> func8(List<Integer> numList, int limit) {
        return numList.stream()
                .filter(x -> x > limit)
                .collect(Collectors.toList());
    }
}

/*
8.	Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
 содержащий только те числа, которые больше заданного значения.
 */