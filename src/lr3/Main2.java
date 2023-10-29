package src.lr3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите название дня: ");

        String day = in.nextLine().toLowerCase();
        System.out.print("Номер дня недели: ");

        if (day.equals("понедельник")) {
            System.out.println(1);
        } else if (day.equals("вторник")) {
            System.out.println(1);
        } else if (day.equals("среда")) {
            System.out.println(1);
        } else if (day.equals("четверг")) {
            System.out.println(1);
        } else if (day.equals("пятница")) {
            System.out.println(1);
        } else if (day.equals("суббота")) {
            System.out.println(1);
        } else if (day.equals("воскресение")) {
            System.out.println(1);
        } else{
            System.out.println("не найден. Некорректный ввод!");
        }

//        switch (day) {
//            case ("понедельник"):
//                System.out.println(1);
//                break;
//            case ("вторник"):
//                System.out.println(2);
//                break;
//            case ("среда"):
//                System.out.println(3);
//                break;
//            case ("четверг"):
//                System.out.println(4);
//                break;
//            case ("пятница"):
//                System.out.println(5);
//                break;
//            case ("суббота"):
//                System.out.println(6);
//                break;
//            case ("воскресение"):
//                System.out.println(7);
//                break;
//            default:
//                System.out.println("не найден. Некорректный ввод!");
//        }
    }
}


/*
2. Напишите программу, в которой пользователю предлагается
ввести название дня недели. По введенному названию программа определяет
порядковый номер дня в неделе. Если пользователь вводит неправильное
название дня, программа выводит сообщение о том, что такого дня нет.
Предложите версию программы на основе вложенных условных операторов и
на основе оператора выбора switch.
 */