package src.timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int num = in.nextInt();

        if (num >= 1 && num <= 4) {
            out.println("few");
            out.flush();
        } else if (num >= 5 && num <= 9) {
            out.println("several");
            out.flush();
        } else if (num >= 10 && num <= 19) {
            out.println("pack");
            out.flush();
        } else if (num >= 20 && num <= 49) {
            out.println("lots");
            out.flush();
        } else if (num >= 50 && num <= 99) {
            out.println("horde");
            out.flush();
        } else if (num >= 100 && num <= 249) {
            out.println("throng");
            out.flush();
        } else if (num >= 250 && num <= 499) {
            out.println("swarm");
            out.flush();
        } else if (num >= 500 && num <= 999) {
            out.println("zounds");
            out.flush();
        } else if (num >= 1000) {
            out.println("legion");
            out.flush();
        }
    }
}

//https://acm.timus.ru/problem.aspx?space=1&num=1785