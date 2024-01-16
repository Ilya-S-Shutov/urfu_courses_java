package src.lr7.task2;

public class Main2 {
    public static void main(String[] args) {
        Task2sub example1 = new Task2sub("str", 15);
        System.out.printf("str: %s, int: %d\n", example1.getStrAttr(), example1.intAttr);

        example1.setAttrs();
        System.out.printf("str: %s, int: %d\n", example1.getStrAttr(), example1.intAttr);

        example1.setAttrs(18);
        System.out.printf("str: %s, int: %d\n", example1.getStrAttr(), example1.intAttr);

        example1.setAttrs("newStr");
        System.out.printf("str: %s, int: %d\n", example1.getStrAttr(), example1.intAttr);

        example1.setAttrs("newStr", 25);
        System.out.printf("str: %s, int: %d\n", example1.getStrAttr(), example1.intAttr);

    }
}


/*
2.
Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
базовом классе (суперклассе) должен быть метод для присваивания значения полю с
текстовым параметром. Объект суперкласса создается передачей одного текстового
аргумента конструктору. Добавьте метод, который возвращает длину текстовой строки.
На основе суперкласса создается подкласс. В подклассе появляется дополнительное
открытое (публичное) целочисленное поле. В классе должны быть такие версии метода
для присваивания значений полям (используется переопределение и перегрузка метода из
суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
текстовым и целочисленным параметром. У конструктора подкласса два параметра
(целочисленный и текстовый).
 */