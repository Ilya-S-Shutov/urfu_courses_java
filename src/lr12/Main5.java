package src.lr12;

import java.util.Random;

public class Main5 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000);
        }

        int maxNumber = findMax(arr);
//        final int cores = Runtime.getRuntime().availableProcessors();
//        System.out.printf("Amount cores: %d", cores);
        System.out.printf("Max number: %d", maxNumber);
    }

    public static int findMax(int[] arr) {
        final int cores = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[cores];
        int[] maxNumbersArray = new int[cores];
        try {
            for (int i = 0; i < cores; i++) {
                final int start = i * (arr.length / cores);
                final int end = (i + 1) * (arr.length / cores);
                final int index = i;
                threads[i] = new Thread(() -> {

                    int max = Integer.MIN_VALUE;
                    for (int j = start; j < end; j++) {
                        if (j < arr.length && arr[j] > max) {
                            max = arr[j];
                        }
                    }
                    maxNumbersArray[index] = max;
                });
                threads[i].start();
            }

            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException err) {
            err.printStackTrace();
        }

        int max = Integer.MIN_VALUE;
        for (Integer i : maxNumbersArray) {
            if (i > max) {
                max = i;
            }
        }
        return max;

    }
}

/*
Напишите функцию, которая находит максимальный элемент в массиве целых чисел при помощи многопоточности.
Количество потоков должно быть равно количеству ядер процессора.
 */