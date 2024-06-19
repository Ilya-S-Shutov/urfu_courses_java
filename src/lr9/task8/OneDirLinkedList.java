package src.lr9.task8;

import java.util.Scanner;

public class OneDirLinkedList {
    static class Node {
        Integer val;
        Node next;

        Node(int value) {
            this.val = value;
            this.next = null;
        }
    }

    Node head;

    public void addFirst(int value) {
        Node newHead = new Node(value);
            newHead.next = this.head;
            this.head = newHead;
    }

    public void addLast(int value) {
        Node newTail = new Node(value);
        if (this.head == null) {
            this.head = newTail;
        } else {
            Node cursor = this.head;
            while (cursor.next != null) {
                cursor = cursor.next;
            }
            cursor.next = newTail;
            }
    }

    public void createHead() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input value or \"!off\": ");
        String value = in.nextLine();
        while (!value.equals("!off") && !value.isEmpty()) {
            this.addFirst(Integer.parseInt(value));
            System.out.print("Input value or \"!off\": ");
            value = in.nextLine();
        }
        System.out.printf("Your LinkedList: %s", this.toString());
    }

    public void createTail() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input value or \"!off\": ");
        String value = in.nextLine();
        while (!value.equals("!off") && !value.isEmpty()) {
            this.addLast(Integer.parseInt(value));
            System.out.print("Input value or \"!off\": ");
            value = in.nextLine();
        }
        System.out.printf("Your LinkedList: %s", this.toString());
    }

    public void insert(int value, int index) {
        int counter = 1;
        Node cursor = this.head;
        Node node = new Node(value);
        if (index == 0 && cursor.next == null) {
            cursor.next = node;
        }
        else {
            while (cursor.next != null && counter++ < index) {
                cursor = cursor.next;
            }
            node.next = cursor.next;
            cursor.next = node;
        }

    }

    public void removeFirst() {
        this.head = this.head.next;
    }

    public void removeLast() {
        Node tail = this.head;
        while (tail.next.next != null) {
            tail = tail.next;
        }
        tail.next = null;
    }

    public void remove(int index) {
        int counter = 1;
        Node cursor = this.head;
        if (index == 0 && cursor.next == null) {
            this.head = null;
        } else if (index == 0 && cursor.next != null) {
            this.head = cursor.next;
        } else {
            while (cursor.next != null && counter < index) {
                counter++;
                cursor = cursor.next;
            }
            cursor.next = cursor.next.next;
        }
    }

    @Override
    public String toString(){
        Node cursor = this.head;
        String result = "[";
        while (cursor != null) {
            result += cursor.val.toString();
            cursor = cursor.next;
            if (cursor != null) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}
