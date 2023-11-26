package src.lr6.task10;


import java.util.Arrays;

public class Main10 {
    public static void main(String[] args) {
        int[] intArray = {1, 11, 3, 5, 8, 6, 7, 8, 9};

        int[] result = Task10.getMinMax(intArray);
        System.out.printf("Исходный массив: %s\nМинимум: %d\nМаксимум: %d\n",
                Arrays.toString(intArray),
                result[0],
                result[1]);
    }
}
