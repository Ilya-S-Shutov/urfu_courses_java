package src.lr6.task6;

import java.util.Arrays;

public class Task6 {

    public static int[] getArraysPart(int[] startArray, int amount) {
        int[] newArray;

        if (amount > startArray.length) {
            newArray = Arrays.copyOf(startArray, startArray.length);
        } else {
            newArray = Arrays.copyOf(startArray, amount);
        }
        return newArray;

    }

}


/*
Напишите программу со статическим методом,
которому аргументом передается целочисленный массив и целое число.
Результатом метод возвращает ссылку на новый массив,
который получается из исходного массива (переданного первым аргументом методу),
если в нем взять несколько начальных элементов. Количество элементов,
которые нужно взять из исходного массива, определяются вторым аргументом метода.
Если второй аргумент метода больше длины массива, переданного первым аргументом,
то методом создается копия исходного массива и возвращается ссылка на эту копию.
 */