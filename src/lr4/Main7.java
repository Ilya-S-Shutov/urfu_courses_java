package src.lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите изначальное кол-во строк: ");
        int rows = in.nextInt();
        System.out.print("Введите изначальное кол-во столбцов: ");
        int columns = in.nextInt();

        int[][] numArray = new int[rows][columns];
        int counter = 0;

        for (int i = 0; i < numArray.length; i++) {
            if (i%2 == 0) {
                for (int j = 0; j < numArray[i].length; j++) {
                    numArray[i][j] = counter++;
                }
            } else {
                for (int j = numArray[i].length - 1; j >= 0; j--) {
                    numArray[i][j] = counter++;
                }
            }
        }

        System.out.printf("Итоговый массив:\n%s\n",
                Arrays.deepToString(numArray).replace("], ", "],\n")
        );
    }
}


/*
7. Напишите программу, в которой создается двумерный числовой массив
и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
затем последний столбец (снизу вверх), вторая строка (слева направо) и так
далее.
 */