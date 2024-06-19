package src.lr9.task1;

public class Demo4 {
    public static int factorial(int x) {
        int result;
        if (x == 1) {
            return 1;
        } else {
            result = x * factorial(x - 1);
            return result;
        }

    }

    public static void main(String[] args) {
        System.out.print(factorial(5));
    }
}

/*
Код вывода параметра перед вхождением в рекурсивный вызов и после него
 */