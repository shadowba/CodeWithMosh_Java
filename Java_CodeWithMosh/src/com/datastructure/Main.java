package com.datastructure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addFirst(0);
//        list.deleteLast();
//        list.deleteFirst();
        System.out.println("Finished");
        System.out.println(list.contains(10));
        System.out.println(list.contains(50));
        list.addLast(50);
        System.out.println(list.indexOf(50));
        System.out.println(Arrays.toString(list.toArray()));
        list.addLast(60);
        System.out.println(Arrays.toString(list.toArray()));
        list.reverse();
        System.out.println(Arrays.toString(list.toArray()));
        list.printMiddle();
    }
}
