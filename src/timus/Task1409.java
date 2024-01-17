package src.timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int first = in.nextInt();
        int second = in.nextInt();

        out.printf("%d %d", second - 1, first - 1);
        out.flush();
    }
}

//https://acm.timus.ru/problem.aspx?space=1&num=1409