package src.timus;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        ArrayList<Double> result = new ArrayList<>();

        while (in.hasNextDouble()) {
            double number = in.nextDouble();
            result.add(Math.sqrt(number));
        }

        for (int i = result.size()-1; i >= 0; i--) {
            out.printf("%.4f\n", result.get(i));
        }
    }
}

//https://acm.timus.ru/problem.aspx?space=1&num=1001