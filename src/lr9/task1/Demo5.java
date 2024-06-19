package src.lr9.task1;

public class Demo5 {

    private static int fib_number = 10;
    public static void space(int deep){
        for (int i = 0; i < fib_number-deep; i++) {
            System.out.print("-");
        }
        System.out.print(">");
    }
    public static int fib(int n) {
        space(n);
        System.out.println("Считаем значение для элемента с номером " + n);
        if (n == 0) {
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

    }

    public static void main(String[] args) {
        System.out.println(fib(fib_number));
    }
}


/*
Вывести число Фибоначчи, заданное его номером в
последовательности.
Вывести в консоль последовательность обхода дерева рекурсивных вызовов.
 */