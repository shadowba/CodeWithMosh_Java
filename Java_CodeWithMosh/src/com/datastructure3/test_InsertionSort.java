package com.datastructure3;

import java.util.Arrays;

public class test_InsertionSort {
    public static void main(String[] args) {
        InsertionSort sorter=new InsertionSort();
        int[] inputArray={1,3,7,4,2,0};
        sorter.sort(inputArray);

        System.out.println(Arrays.toString(inputArray));
    }

}
