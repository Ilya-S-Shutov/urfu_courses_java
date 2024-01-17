package src.timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int throughput = in.nextInt();
        int time = in.nextInt();
        int result = 0;

        for (int i = 0; i < time; i++) {
            result += in.nextInt() - throughput;
            if (result < 0) {
                result = 0;
            }
        }

        out.print(result);
        out.flush();
    }
}

//https://acm.timus.ru/problem.aspx?space=1&num=1787