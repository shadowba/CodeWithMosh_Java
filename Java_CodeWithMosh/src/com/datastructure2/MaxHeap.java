package com.datastructure2;

public class MaxHeap {
    public static void heapify(int[] inputArray) {
//        int[] outputArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++)
            heapify(inputArray, i);
    }

    private static void heapify(int[] array, int index) {
        int largerIndex = index;

        int leftIndex = index * 2 + 1;
        if (leftIndex < array.length && array[leftIndex] > array[largerIndex])
            largerIndex = leftIndex;

        int rightIndex = index * 2 + 2;
        if (rightIndex < array.length && array[rightIndex] > array[largerIndex])
            largerIndex = rightIndex;

        if (index == largerIndex)
            return;

        swap(array,index,largerIndex);
        heapify(array,largerIndex);
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static int[] sortHeap(int[] inputArray) {

        Heap heap = new Heap();
        for (int item : inputArray) {
            heap.insert(item);
        }

        int[] outputArray = new int[heap.size()];
        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = heap.remove();
        }

        return outputArray;
    }
}
