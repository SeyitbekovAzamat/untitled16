package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        list1.add(scanner.nextLine());
        list1.add(scanner.nextLine());
        list1.add(scanner.nextLine());
        list1.add(scanner.nextLine());
        list1.add(scanner.nextLine());
        System.out.println(list1);
        list2.add(scanner.nextLine());
        list2.add(scanner.nextLine());
        list2.add(scanner.nextLine());
        list2.add(scanner.nextLine());
        list2.add(scanner.nextLine());
        Collections.reverse(list2);
        System.out.println(list2);
        list3.addAll(list1);
        list3.addAll(list2);
        Collections.rotate(list3.subList(1,6),-1);
        Collections.rotate(list3.subList(1,7),-1);
        Collections.rotate(list3.subList(1,8),-1);
        Collections.rotate(list3.subList(1,9),-1);

        System.out.println(list3);

        list3.sort(Comparator.comparing(String::length));
        System.out.println(list3);
    }
}
/*Нургазы, [15.03.2022 21:51]
        [Переслано от Нургазы]
        #ДЗ 4-й урок
        7)  (Дэдлайн до урока)
        a) Используйте цикл
        b)  Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
        c)  Затем программа должна отобразить этот список
        d)  Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б. После также отображает его в консоли
        e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
        f)  После объединения отобразить в консоли список С
        g)   В конце отсортировать элементы списка С по длине слова, сначала идут String-и с наименьшим количеством символов, и распечатать отсортированный список С.
*/