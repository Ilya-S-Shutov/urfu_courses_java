package src.lr3;

import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {
        int length = 10;
        char[] symArray = new char[length];
        int j = 'A';

        for (int i = 0; i < length;) {
            if (
                    !("AEIOUY".contains(Character.toString((char) j)))
            ) {
                symArray[i] = (char) j;
                i++;

            }
            j++;
        }
        System.out.printf("Результат: %s", Arrays.toString(symArray));
    }
}


/*
8. Напишите программу, в которой создается символьный массив из
10 элементов. Массив заполнить большими (прописными) буквами
английского алфавита. Буквы берутся подряд, но только согласные (то есть
гласные буквы ’А', 'Е' и 'I' при присваивании значений элементам массива
нужно пропустить). Отобразите содержимое созданного массива в консольном
окне.

 */