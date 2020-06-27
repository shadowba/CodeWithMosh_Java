package com.datastructure3;

public class searchAlgorithm {
    public int binarySearch(int[] array, int target) {
        return binarySearchRec(array, 0, array.length - 1, target);
//        return binarySearchIterate(array,0,array.length-1,target);
    }

    private int binarySearchRec(int[] array, int left, int right, int target) {
        int length = right - left + 1;

        if (length <= 0)
            return -1;

        int midIndex = (length + 1) / 2 - 1 + left;

        if (array[midIndex] == target)
            return midIndex;

        if (array[midIndex] > target)
            right = midIndex - 1;
        else
            left = midIndex + 1;

        return binarySearchRec(array, left, right, target);
    }

    private int binarySearchIterate(int[] array, int left, int right, int target) {
        while (left <= right) {
            var middle = (left + right) / 2;
            if (array[middle] == target)
                return middle;

            if (target < array[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }
        return -1;
    }
}
