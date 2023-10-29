package src.lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Укажите размер массива: ");
        int length = in.nextInt();
        int[] numArray = new int[length];
        int[] indexArray = new int[length];

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            numArray[i] = random.nextInt(5);
        }

        System.out.printf("Массив: %s\n", Arrays.toString(numArray));

        int min = numArray[0], count_index = 0;
        indexArray[count_index] = 0;

        for (int i = 1; i < length; i++) {
            if (numArray[i] == min) {
                count_index++;
                indexArray[count_index] = i;
            } else if (numArray[i] < min){
                min = numArray[i];
                count_index = 0;
                indexArray[count_index] = i;
            }

        }

        System.out.printf("Наименьшее число: %d\n", min);
        System.out.print("Встречается на следующих позициях: ");
        for (int i = 0; i < count_index+1; i++) {
            System.out.printf("%d ", indexArray[i]);
        }


    }
}


/*
9. Напишите программу, в которой создается массив и заполняется
случайными числами. Массив отображается в консольном окне. В этом
массиве необходимо определить элемент с минимальным значением. В
частности, программа должна вывести значение элемента с минимальным
значением и индекс этого элемента. Если элементов с минимальным
значением несколько, должны быть выведены индексы всех этих элементов.
 */