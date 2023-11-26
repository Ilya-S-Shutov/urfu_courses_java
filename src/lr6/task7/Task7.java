package src.lr6.task7;

public class Task7 {

    public static int[] getIntArray(char[] charArray) {
        int[] intArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = charArray[i];
        }
        return intArray;
    }
}

/*
7.	Напишите программу со статическим методом, аргументом которому передастся символьный массив,
а результатом возвращается ссылка на целочисленным массив,
состоящий из кодов символов из массива-аргумента.
 */