package com.company;


import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String>color=new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Blek");
        System.out.println(color);
        color.add("White");
        color.add("Pink");
        color.add("Yellow");
        System.out.println(color);
        Collections.sort(color);
        System.out.println(color);
        Collections.reverse(color);
        System.out.println(color);
        Collections.shuffle(color);
        System.out.println(color);


}

    }
