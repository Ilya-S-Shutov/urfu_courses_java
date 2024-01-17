package src.timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1197 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int amountTests = Integer.parseInt(in.nextLine());
        int[] results = new int[amountTests];

        for (int i = 0; i < amountTests; i++) {
            String test = in.nextLine();
            results[i] = getResult(test.charAt(0), test.charAt(1));

        }

        for (int j: results) {
            out.println(j);
            out.flush();

        }
    }


    private static int getResult(char first, char second) {
        int x, y;
        if (first == 'a' || first == 'h') {
            x = 2;
        } else if (first == 'b' || first == 'g') {
            x = 1;
        } else {
            x = 0;
        }

        if (second == '1' || second == '8') {
            y = 2;
        } else if (second == '2' || second == '7') {
            y = 1;
        } else {
            y = 0;
        }

//        Версия для проверки на timus
//        switch (x+y) {
//            case (4):
//                return 2;
//            case (3):
//                return 3;
//            case (2):
//                return 4;
//            case (1):
//                return 6;
//            default:
//                return 8;
//        }

        return switch (x + y) {
            case (4) -> 2;
            case (3) -> 3;
            case (2) -> 4;
            case (1) -> 6;
            default -> 8;
        };
    }
}


//https://acm.timus.ru/problem.aspx?space=1&num=1197