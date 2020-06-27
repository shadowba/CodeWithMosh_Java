package com.datastructure3;

public class InsertionSort {
    public void sort(int[] array) {
        final int N = array.length;


        for (int i = 1; i < N; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;

        }

    }
}
