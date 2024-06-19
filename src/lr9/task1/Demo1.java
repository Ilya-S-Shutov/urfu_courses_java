package src.lr9.task1;

public class Demo1 {
    public static void main(String[] args) {
        method(1);
    }

    public static void method(int x) {
        System.out.println("x = " + x);
        int new_x = (2*x + 1);
        if (new_x < 20) {
            method(new_x);
        }

    }
}

/*
Для заданного параметра x вывести последовательность
значений элементов числового ряда в соответствии со следующими требованиями:
1) очередной элемент x = 2*x+1 (новое значение вычисляется с использованием старого);
2) 0 ≤ x < 20
 */
