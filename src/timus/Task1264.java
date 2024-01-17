package src.timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n, m;

        n = in.nextInt();
        m = in.nextInt();

        out.println(n * (m + 1));
        out.flush();
    }
}

//https://acm.timus.ru/problem.aspx?space=1&num=1264