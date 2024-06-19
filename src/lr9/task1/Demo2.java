package src.lr9.task1;

public class Demo2 {
    public static void main(String[] args) {
        method(1);
    }

    public static void method(int x) {
        int new_x = (2*x + 1);
        if (new_x < 20) {
            method(new_x);
        }
        System.out.println("x = " + x);

    }
}

/*
Вывести последовательность, представленную в предыдущем примере, в обратном порядке.
 */