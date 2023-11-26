package src.lr6.task3;

public class Task3 {

    public static int getMin(int... nums) {
        int min = nums[0];
        for (int num: nums) {
            min = Math.min(num, min);
        }
        return min;
    }

    public static int getMax(int... nums) {
        int max = nums[0];
        for (int num: nums) {
            max = Math.max(num, max);
        }
        return max;
    }

    public static float getMean(int... nums) {
        int total = 0;
        for (int num: nums) {
            total += num;
        }
        return (float) total / nums.length;
    }
}


/*
3.	Напишите программу с классом, в котором есть статические методы,
которым можно передавать произвольное количество целочисленных аргументов
(или целочисленный массив). Методы, на основании переданных аргументов или массива,
позволяют вычислить: наибольшее значение, наименьшее значение,
а также среднее значение из набора чисел.
 */