package src.lr4;

public class Main1 {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 23; j++) {
               if (j == 0) {
                   System.out.print("|");
               } else if (j == 22) {
                   System.out.println("|");
               } else if (i == 0 || i == 10) {
                   System.out.print("-");
               } else {
                   System.out.print(" ");
               }
            }
        }
    }
}

/*
1. Напишите программу, которая выводит в консольное окно
прямоугольник, размеры сторон которого, ширина: 23 колонки, высота: 11
строк;
 */
