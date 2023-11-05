package src.lr4;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.print("Введите ключ: ");
        int key = in.nextInt();
        in.nextLine();
        char newChar;
        String answer;

        char[] textArray = text.toCharArray();

        for (int i = 0; i < textArray.length; i++) {
            newChar = (char) (textArray[i] + key);
            textArray[i] = newChar;
        }

        System.out.print("Текст после преобразования: ");
        String newText = new String(textArray);
        System.out.print(newText);

        System.out.print("\nВыполнить обратное преобразование (y/n)? ");
        while (true) {
            answer = in.nextLine();
            if (answer.equals("y")) {
                System.out.print("Текст до преобразования: ");
                for (int i = 0; i < textArray.length; i++) {
                    newChar = (char) (textArray[i] - key);
                    textArray[i] = newChar;
                }
                String old = new String(textArray);
                System.out.print(old);
                break;
            } else if (answer.equals("n")) {
                System.out.print("До свидания!");
                break;
            } else {
                System.out.println("\nВведите корректный ответ: ");
            }
        }
    }
}

/*
8. Напишите программу «Шифр Цезаря», которая зашифровывает
введенный текст. Используете кодовую таблицу символов. При запуске
программы в консоль необходимо вывести сообщение: «Введите текст для
шифрования», после ввода текста, появляется сообщение: «Введите ключ».
После того как введены все данные, необходимо вывести преобразованную
строку с сообщением «Текст после преобразования : ». Далее необходимо
задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
если пользователь вводит «y», тогда выполнить обратное преобразование.
Если пользователь вводит «n», того программа выводит сообщение «До
свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
то программа ему выводит сообщение: «Введите корректный ответ»
 */