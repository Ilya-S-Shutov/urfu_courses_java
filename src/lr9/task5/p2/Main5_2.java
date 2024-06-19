package src.lr9.task5.p2;

import src.lr9.task4.Node;

public class Main5_2 {
    public static void main(String[] args) {
        Node head = null;
        for (int i=0; i < 10; i++) {
            head = new Node(i, head);
        }

        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}

/*
Создать два проекта, в которых продемонстрировать два способа создания линейного однонаправленного списка
(с головы и с хвоста) согласно примеру 2 из второго раздела.
Отработать код с помощью отладчика и привести скриншоты минимум трех точек, обработанных отладчиком.
 */