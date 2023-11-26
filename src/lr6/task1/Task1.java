package src.lr6.task1;

public class Task1 {

    private char sym;
    private String string;

    public void printProperties() {
        System.out.printf("Значение символьного поля: %s\nЗначение строчного поля: %s\n", this.sym, this.string);
    }

    public void setProperties(char sym) {
        this.sym = sym;
    }

    public void setProperties(String string) {
        this.string = string;
    }

    public void setProperties(char[] charArray) {
        if (charArray.length == 1) {
            this.sym = charArray[0];
        } else {
            this.string = String.valueOf(charArray);
        }
    }
}


/*
1.	Напишите программу с классом, в котором есть два поля: символьное и текстовое.
В классе должен быть перегруженный метод для присваивания значений полям.
Если метод вызывается с символьным аргументом,
то соответствующее значение присваивается символьному полю.
Если метод вызывается с текстовым аргументом,
то он определяет значение текстового поля.
Методу аргументом также может передаваться символьный массив.
Если массив состоит из одного элемента, то он определяет значение символьного поля.
В противном случае (если в массиве больше одного элемента)
из символов массива формируется текстовая строка и присваивается значением
текстовому полю.
 */