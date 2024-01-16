package src.lr7.task4;

public class Main4 {
    public static void main(String[] args) {
        Task4 examp1 = new Task4('a');
        System.out.println(examp1 + "\n");

        Task4sub1 examp2 = new Task4sub1('b', "str1");
        System.out.println(examp2 + "\n");

        Task4sub2 examp3 = new Task4sub2('b', "str1", 10);
        System.out.println(examp3 + "\n");

    }
}


/*
4
Напишите программу, в которой использована цепочка наследования из трех
классов. В первом классе есть открытое символьное поле. Во втором классе появляется
открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
каждом из классов должен быть конструктор, позволяющий создавать объект на основе
значений полей, переданных аргументами конструктору, а также конструктор создания
копии.
 */