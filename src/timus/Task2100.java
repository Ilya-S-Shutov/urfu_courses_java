package src.timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task2100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int amountGuests = Integer.parseInt(in.nextLine());
        int count = 2;
        int result;
        String answer;

        for (int i = 0; i < amountGuests; i++) {
            answer = in.nextLine();
            if (answer.contains("+one")) {
                count++;
            }
            count++;
        }
        if (count == 13) {
            count++;
        }
        result = count * 100;

        out.print(result);
        out.flush();
    }
}

//https://acm.timus.ru/problem.aspx?space=1&num=2100