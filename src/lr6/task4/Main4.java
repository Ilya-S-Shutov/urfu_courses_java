package src.lr6.task4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.printf("Двойной факториал числа 6: %d\n", Task4.getDoubleFact(6));
        System.out.printf("Двойной факториал числа 5: %d\n", Task4.getDoubleFact(5));

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        System.out.printf("Двойной факториал числа %d: %d\n", num, Task4.getDoubleFact(num));
    }
}
