package src.lr6.task7;

import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        System.out.printf("Исходный массив: %s\nАльтернативный массив: %s\n",
                Arrays.toString(chars),
                Arrays.toString(Task7.getIntArray(chars)));
    }
}
