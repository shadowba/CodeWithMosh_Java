package com.datastructure2;

import java.util.ArrayList;
import java.util.Arrays;

public class Test_Heaps {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(15);
        heap.insert(10);
        heap.insert(3);
        heap.insert(8);
        heap.insert(12);
        heap.insert(9);
        heap.insert(4);
        heap.insert(1);
        heap.insert(24);

        System.out.println(heap.toString());

        heap.remove();
        System.out.println(heap.toString());

        int[] input = {5, 3, 8, 4, 1, 2};
        int[] output=new int[input.length];
        output=MaxHeap.sortHeap(input);
        System.out.println(Arrays.toString(input));
        MaxHeap.heapify(input);
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(output));
    }
}
