package src.lr7.task1;

public class Main1 {

    public static void main(String[] args) {

        Task1 example1 = new Task1("Some string");
        Task1sub example2 = new Task1sub("Some string");
        Task1sub example3 = new Task1sub("Some string1", "Add more strings!");

        System.out.println(example1);
        System.out.println(example2);
        System.out.println(example3);

    }

}


/*
1
Напишите программу, в которой есть суперкласс с приватным текстовым полем,
конструктором с текстовым параметром и где переопределен метод toString (). На основе
суперкласса путем наследования создается подкласс. У него появляется еще одно
приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и
двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
В обоих классах метод toString () переопределяется так, что он возвращает строку с
названием класса и значение текстового поля или текстовых полей.
 */