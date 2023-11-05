package src.lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String temp = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюяABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890 !.,?:;";
        char[] alphabet = temp.toCharArray();
        System.out.printf("Список допустимых символов: %s\n", Arrays.toString(alphabet));

        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.print("Введите ключ: ");
        int key = in.nextInt();
        in.nextLine();

        char newChar;
        int newCharIndex = 0;
        String answer;

        char[] textArray = text.toCharArray();

        for (int i = 0; i < textArray.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j] == textArray[i]) {
                    newCharIndex = (j + key) % alphabet.length;
                    break;
                }
            }

            newChar = alphabet[newCharIndex];
            textArray[i] = newChar;
        }

        System.out.print("Текст после преобразования: ");
        for (char sym : textArray) {
            System.out.print(sym);
        }

        System.out.print("\nВыполнить обратное преобразование (y/n)? ");
        while (true) {
            answer = in.nextLine();
            if (answer.equals("y")) {
                for (int i = 0; i < textArray.length; i++) {
                    for (int j = 0; j < alphabet.length; j++) {
                        if (alphabet[j] == textArray[i]) {
                            newCharIndex = j - key;
                            if (newCharIndex < 0) {
                                newCharIndex = alphabet.length + newCharIndex;
                            }
                            break;
                        }
                    }

                    newChar = alphabet[newCharIndex];
                    textArray[i] = newChar;
                }
                System.out.print("Текст после преобразования: ");
                for (char sym : textArray) {
                    System.out.print(sym);
                }
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
9* (дополнительная задача). Напишите программу «Шифр Цезаря», в которой
необходимо реализовать собственный алфавит, остальные условия идентичны
задаче 8.
 */