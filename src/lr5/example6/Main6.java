package src.lr5.example6;

public class Main6 {
    public static void main(String[] args) {

        TestClass6 test1 = new TestClass6(5);
        test1.printNumber();
        test1 = new TestClass6(5,2);
        test1.printNumber();
        test1.setNums(70,11);
        test1.printNumber();
        test1.setNums(-8);
        test1.printNumber();

    }
}

/*
6. Напишите программу с классом, в котором есть два закрытых
целочисленных поля (назовем их max и min). Значение поля max не может
быть меньше значения поля min. Значения полям присваиваются с помощью
открытого метода. Метод может вызываться с одним или двумя
целочисленными аргументами. При вызове метода значения полям
присваиваются так: сравниваются текущие значения полей и значения
аргументов, переданных методу. Самое большое из значений присваивается
полю max, а самое маленькое из значений присваивается полю min.
Предусмотрите конструктор, который работает по тому же принципу, что и
метод для присваивания значений полям. В классе также должен быть метод,
отображающий в консольном окне значения полей объекта.
 */