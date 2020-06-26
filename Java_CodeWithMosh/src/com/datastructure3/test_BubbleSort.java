package com.datastructure3;

import java.util.Arrays;

public class test_BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort=new BubbleSort();

        int[] inputArray={1,3,7,4,2,0};
        bubbleSort.sort(inputArray);
        System.out.println(Arrays.toString(inputArray));

    }
}
