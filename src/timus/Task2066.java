package src.timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task2066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int result = Math.min(a - b - c, a - b*c);

        out.println(result);
        out.flush();
    }
}

//https://acm.timus.ru/problem.aspx?space=1&num=2066