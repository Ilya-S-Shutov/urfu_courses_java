package src.lr6.task5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        System.out.printf("Сумма квадратов до числа %d: %d\n", num, Task5.sumSquares(num));
    }
}
