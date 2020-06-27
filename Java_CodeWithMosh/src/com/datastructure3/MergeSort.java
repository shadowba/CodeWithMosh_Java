package com.datastructure3;

public class MergeSort {
    public void sort(int[] array) {
        // Base condition
        if (array.length < 2)
            return;

        // Divide this array into half
        int middleIndex = array.length / 2;
        int[] left = new int[middleIndex];
        for (int i = 0; i < middleIndex; i++)
            left[i] = array[i];

        int[] right = new int[array.length - middleIndex];
        for (int i = middleIndex; i < array.length; i++)
            right[i - middleIndex] = array[i];

        // Sort each half
        sort(left);
        sort(right);

        // Merge the result
        merge(left, right, array);
    }

    private void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }
    }
}
