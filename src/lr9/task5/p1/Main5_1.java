package src.lr9.task5.p1;

import src.lr9.task4.Node;

public class Main5_1 {
     public static void main(String[] args) {
//          Node node3 = new Node(4, null);
//          Node node2 = new Node(3, node3);
//          Node node1 = new Node(2, node2);
//          Node node0 = new Node(1, node1);

          Node head = null;
          for (int i=9; i >= 0; i--) {
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