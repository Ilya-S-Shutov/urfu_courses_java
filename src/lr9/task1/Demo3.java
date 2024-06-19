package src.lr9.task1;

public class Demo3 {

    private static int step = 0;
    public static void method(int x) {
        space();
        System.out.println(x + "-> ");
        step++;
        int new_x = 2*x + 1;
        if (new_x < 20) {
            method(new_x);
        }
        step--;
        space();
        System.out.println(" <-" + x);
    }

    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");
        }

    }

    public static void main(String[] args) {
        method(1);
    }
}
