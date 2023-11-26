package src.lr6.task8;

import java.util.Arrays;

public class Task8 {

    public static double getMean(int[] ints) {
        return (double) Arrays.stream(ints).sum()/ints.length;
    }
}


/*
8.	Напишите программу со статическим методом,
аргументом которому передается целочисленный массив,
а результатом возвращается среднее значение для элементов массива
(сумма значений элементов, деленная на количество элементов в массиве).
 */