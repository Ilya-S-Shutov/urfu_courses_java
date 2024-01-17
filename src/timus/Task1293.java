package src.timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int result = 2;

        for (int i = 0; i < 3; i++) {
            result *= in.nextInt();
        }


        out.print(result);
        out.flush();
    }
}

//https://acm.timus.ru/problem.aspx?space=1&num=1293