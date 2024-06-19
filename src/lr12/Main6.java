package src.lr12;

import java.util.Random;

public class Main6 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
        }

        int total = findSum(arr);
        System.out.printf("Summ: %d", total);
    }

    private static int findSum(int[] arr) {
        final int cores = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[cores];
        int[] sums = new int[cores];

        try {
            for (int i = 0; i < threads.length; i++) {
                final int index = i;
                final int start = index * (arr.length / cores);
                final int end = (index + 1) * (arr.length / cores);
                threads[i] = new Thread(() -> {
                    sums[index] = 0;
                    for (int j = start; j < end; j++) {
                        sums[index] += arr[j];
                    }
                });
                threads[i].start();
            }

            for (Thread thread : threads) {
                thread.join();
            }

        } catch (InterruptedException err) {
            err.printStackTrace();
        }

        int sum = 0;
        for (int i: sums) {
           sum += i;
        }

        return sum;
    }

}
/*
Напишите функцию, которая суммирует элементы в массиве целых чисел при помощи многопоточности.
Количество потоков должно быть равно количеству ядер процессора.
 */