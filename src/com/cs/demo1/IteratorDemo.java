package com.cs.demo1;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<String>();
        all.add("hello");
        all.add("world");
        all.add("sina");
        all.add("sohu");
        ListIterator<String> iter = all.listIterator();



    }
}
