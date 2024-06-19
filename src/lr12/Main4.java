package src.lr12;

public class Main4 {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            final int threadNumber = i;
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + ": " + threadNumber);
            }).start();
        }
    }
}

/*
Напишите программу, которая создает 10 потоков и каждый поток выводит на экран свой номер.
 */