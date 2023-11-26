package src.lr6.task9;


import java.util.Arrays;

public class Main9 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e'};

        System.out.printf("Исходный массив: %s\n",
                Arrays.toString(chars));

        Task9.reverse(chars);

        System.out.printf("Новый вариант исходного массива : %s\n",
                Arrays.toString(chars));

        char[] chars2 = {'a', 'b', 'c', 'd', 'e', 'f'};

        System.out.printf("Исходный массив: %s\n",
                Arrays.toString(chars2));

        Task9.reverse(chars2);

        System.out.printf("Новый вариант исходного массива : %s\n",
                Arrays.toString(chars2));
    }
}
