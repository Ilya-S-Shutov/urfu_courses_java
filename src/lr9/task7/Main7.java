package src.lr9.task7;

import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int N = in.nextInt();

        ArrayList<Integer> arrayListNumbers = new ArrayList<>();
        fillList(arrayListNumbers, N);

        LinkedList<Integer> linkedListNumbers = new LinkedList<>();
        fillList(linkedListNumbers, N);

        long start = System.currentTimeMillis();
        removeListItems(arrayListNumbers);
        long stop = System.currentTimeMillis();
        long timeResult1 = stop - start;

        start = System.currentTimeMillis();
        removeListItems(linkedListNumbers);
        stop = System.currentTimeMillis();
        long timeResult2 = stop - start;

        System.out.println("Handle time for ArrayList: " + timeResult1);
        System.out.println("Handle time for LinkedList: " + timeResult2);
        System.out.println(
                "Обработка ArrayList занимает существенно больше времени, " +
                "поскольку при удалении промежуточных элементов приходится сдвигать все последующие" +
                "ссылки на элементы структурообразующего массива. Для LinkedList эта операция гораздо быстрее," +
                "поскольку для удаления промежутточного элемента достаточно переписать два указателя."
        );
    }

    static public void removeListItems(List<Integer> listInstance) {
        while (listInstance.size() > 1) {
            listInstance.remove(1);
        }
    }

    static public void fillList(List<Integer> listInstance, int N) {
        for (int i = 1; i <= N; i++) {
            listInstance.add(i);
        }
//        return listInstance;
    }
}


/*
В кругу стоят N человек, пронумерованных от 1 до N.
При ведении счета по кругу вычеркивается каждый второй человек, пока не останется один.
Составить две программы, моделирующие процесс. Одна из программ должна использовать класс ArrayList,
а вторая — LinkedList.
Какая из двух программ работает быстрее? Почему?
 */