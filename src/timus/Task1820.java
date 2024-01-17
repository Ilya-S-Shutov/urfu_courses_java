package src.timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int result;
        double n, k;

        n = in.nextDouble();
        k = in.nextDouble();

        if (k >= n) {
            result = 2;
        } else {
            result = (int) Math.ceil(n * 2 / k);
        }

        out.println(result);
        out.flush();
    }
}


//https://acm.timus.ru/problem.aspx?space=1&num=1820