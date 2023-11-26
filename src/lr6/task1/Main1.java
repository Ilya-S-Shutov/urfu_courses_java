package src.lr6.task1;


public class Main1 {
    public static void main(String[] args) {
        Task1 task = new Task1();

        task.setProperties('a');
        task.setProperties("aaa");
        task.printProperties();

        char[] singleCharArray = {'a'};
        char[] manyCharsArray = {'a', 'b', 'c'};

        task.setProperties(singleCharArray);
        task.setProperties(manyCharsArray);
        task.printProperties();

    }
}
