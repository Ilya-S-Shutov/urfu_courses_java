package src.timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1877 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int first = in.nextInt();
        int second = in.nextInt();

        if (first%2 == 0 || second%2 == 1){
            out.println("yes");
        } else {
            out.println("no");
        }
        out.flush();
    }
}

//https://acm.timus.ru/problem.aspx?space=1&num=1877