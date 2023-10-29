package src.lr3;

import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {
        int length = 10;
        char[] symArray = new char[length];
        int j = 'a';

        for (int i = 0; i < length; i++) {
            symArray[i] = (char) j;
            j += 2;
        }

        System.out.printf("Прямой порядок: %s\n", Arrays.toString(symArray));

        System.out.print("Обратный порядок: [");
        for (int i = length-1; i > 0; i--) {
            System.out.print(symArray[i]+", ");
        }
        System.out.print(symArray[0]+"]");

    }
}

/*
7. Напишите программу, в которой создается одномерный символьный массив из 10 элементов.
Массив заполняется буквами «через одну», начиная с буквы 'а': то есть массив заполняется буквами 'а', 'с', 'е', 'f'
и так далее. Отобразите массив в консольном окне в прямом и обратном порядке. Размер массива задается переменной.
 */