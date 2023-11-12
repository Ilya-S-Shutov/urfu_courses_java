package src.lr5.example3;

public class Main3 {
    public static void main(String[] args) {

        TwoIntNumbers test1 = new TwoIntNumbers();
        test1.printNumber();
        TwoIntNumbers test2 = new TwoIntNumbers(1);
        test2.printNumber();
        TwoIntNumbers test3 = new TwoIntNumbers(1, 2);
        test3.printNumber();
    }
}


/*
3. Напишите программу с классом, у которого есть два целочисленных поля.
В классе должны быть описаны конструкторы, позволяющие создавать
объекты без передачи аргументов, с передачей одного аргумента и с передачей
двух аргументов.
 */