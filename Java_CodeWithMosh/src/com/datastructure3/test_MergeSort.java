package com.datastructure3;

import java.util.Arrays;

public class test_MergeSort {
    public static void main(String[] args) {
        MergeSort sorter=new MergeSort();
        int[] inputArray={1,3,7};
        sorter.sort(inputArray);

        System.out.println(Arrays.toString(inputArray));
    }
}
