package src.lr6.task10;

import java.util.Arrays;

public class Task10 {
    public static int[] getMinMax(int... nums) {
        int[] minMax = new int[2];
        minMax[0] = Arrays.stream(nums).min().getAsInt();
        minMax[1] = Arrays.stream(nums).max().getAsInt();
        return minMax;
    }
}


/*
10.	Напишите программу со статическим методом,
аргументом которому передается произвольное количество целочисленных аргументов.
Результатом метод возвращает массив из двух элементов:
это значения наибольшего и наименьшего значений среди аргументов, переданных методу.
 */