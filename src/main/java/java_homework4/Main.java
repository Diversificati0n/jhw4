package java_homework4;

import java.util.*;
import java.util.LinkedList;

//1. Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
//


public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        LinkedList<String> strings = new LinkedList<>();
//
//        while (true) {
//            System.out.print(": ");
//            String input = scan.nextLine();
//
//            try {
//                if (input.equals("print")) {
//                    ListIterator<String> iterator = strings.listIterator(strings.size());
//                    while (iterator.hasPrevious()) {
//                        System.out.println(iterator.previous());
//                    }
//                } else if (input.equals("revert")) {
//                    if (!strings.isEmpty()) {
//                        strings.removeLast();
//                    } else {
//                        throw new IllegalStateException("нечего удалять");
//                    }
//                } else if (input.equals("stop")) {
//                    System.exit(0);
//                } else {
//                    strings.addLast(input);
//                }
//            } catch (Exception e) {
//                System.out.println("ошибка: " + e.getMessage());
//            }
//        }
//
//    }
//_____________________________________________________________________________________________________


//2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("AAAAA");
        list.add("BBBBB");
        list.add("CCCCC");
        list.add("DDDDD");
        list.add("EEEEE");
        System.out.println(list);

        reverse(list);
        System.out.println(list);
    }

    public static void reverse(LinkedList<String> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            String temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
    }
}
