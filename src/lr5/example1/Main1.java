package src.lr5.example1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char newChar;
        System.out.println("Выберите действие:\n1) Изменить символ\n2) Получить код символа\n3) Напечатать символ\n0) Завершить программу");
        String ans = in.nextLine();
        while (!(ans.equals("0"))) {
            switch (ans) {
                case ("1"):
                    System.out.print("Введите новый символ: ");
                    newChar = in.nextLine().charAt(0);
                    CharHandler.setSymbol(newChar);
                    break;
                case ("2"):
                    System.out.printf("Из класса получен код символа: %s", CharHandler.getSymbol());
                    break;
                case ("3"):
                    CharHandler.printChar();
                    break;
                default:
                    System.out.println("Команда не распознана!");
            }

            System.out.println("\nВыберите действие:\n1) Изменить символ\n2) Получить символ\n3) Напечатать символ\n0) Завершить программу");
            ans = in.nextLine();
        }
    }

}


/*
1. Напишите программу с классом, в котором есть закрытое символьное поле
и три открытых метода. Один из методов позволяет присвоить значение полю.
Еще один метод при вызове возвращает результатом код символа. Третий
метод позволяет вывести в консольное окно символ (значение поля) и его код
 */