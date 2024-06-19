package src.lr9.task3;

import java.util.Scanner;

public class Main3 {
    private static int[] myArray;
    private static int lenArray;
    private static final Scanner in = new Scanner(System.in);

    public static void inputArray() {
        System.out.print("Введите длину массива: ");
        int new_lenArray = in.nextInt();
        if (new_lenArray < 1) {
            System.out.println("Длина массива должна быть больше нуля!\n");
            in.nextLine();
            return;
        }
        lenArray = new_lenArray;
        myArray = new int[lenArray];
        inputArray(0);
    }

    public static void inputArray(int index) {
        if (index < lenArray) {
            System.out.printf("Введите элемент для позиции %d: ", index);
            myArray[index] = in.nextInt();
            inputArray(index + 1);
        } else {
            System.out.println("Массив сформирован!\n");
            in.nextLine();
        }
    }

    public static void outputArray() {
        if (myArray == null) {
            System.out.println("Массив не задан!\n");
        } else {
            System.out.print("Массив: [");
            outputArray(0);
        }
    }

    public static void outputArray(int index) {
        if (index == 0) {
            System.out.printf("%d", myArray[index]);
            outputArray(index + 1);
        } else if (index < lenArray) {
            System.out.printf(", %d", myArray[index]);
            outputArray(index + 1);
        } else {
            System.out.println("]\n");
        }
    }

    public static void main(String[] args) {
        String ans = "";
        inputArray();
        while (ans != "0") {
            System.out.print("""
                                Выберите действие:
                                1) Ввести новый массив
                                2) Вывести текущий массив
                                0) Завершить работу
                                """);
            ans = in.nextLine();
            switch (ans) {
                case ("1"):
                    inputArray();
                    break;
                case ("2"):
                    outputArray();
                case ("0"):
                    break;
                default:
                    System.out.println("Команда не распознана!\n");
            }

        }

    }

}


/*
Создать приложение, позволяющее ввести и вывести одномерный массив целых чисел.
Для ввода и вывода массива разработать рекурсивные методы вместо циклов for
 */