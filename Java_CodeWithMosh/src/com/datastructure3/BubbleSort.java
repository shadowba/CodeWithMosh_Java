package com.datastructure3;

public class BubbleSort {
    public void sort(int[] array) {
        if  (array==null)
            throw new IllegalArgumentException("Input Array is Null");
        int cap = array.length - 1;

        while (cap >= 1) {
            for (int i = 1; i <= cap; i++) {
                if (array[i - 1] < array[i])
                    continue;
                swap(array, i);
            }
            cap--;
        }
    }

    private void swap(int[] array, int i) {
        int temp = array[i - 1];
        array[i - 1] = array[i];
        array[i] = temp;
    }
}
