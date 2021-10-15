package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 строк для списка А");
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());

        System.out.println("Список А: " + listA);

        System.out.println("------------------------------");

        System.out.println("Введите 5 строк для списка Б");
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());

        System.out.println("Список Б: " + listB);

        for (int i = 0; i <= 4; i++) {
            int b = 4;
            listC.add(listA.get(i));
            b = b - i;
            listC.add(listB.get(b));
        }
        System.out.println("Список С: " + listC);

        System.out.println("------------------------------");

        Collections.sort(listC);
        System.out.println("Отсортированный список C: " + listC);
    }
}
