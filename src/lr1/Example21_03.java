package src.lr1;

public class Example21_03 {
    public static void main(String[] args) {
        int S = 10, D = 20;
        if (S < D) System.out.println("S < D");

        S = S * 2;
        if (S == D) System.out.println("S = D");

        S = S * D;
        if (S > D) System.out.println("S > D");
    }
}
