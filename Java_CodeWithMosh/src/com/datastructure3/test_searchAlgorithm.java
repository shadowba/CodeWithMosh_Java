package com.datastructure3;

public class test_searchAlgorithm {
    public static void main(String[] args) {
        int[] inputArray={1,3,5,7,9,11,13,15};
        var searcher=new searchAlgorithm();
        int target=15;
        int result=searcher.binarySearch(inputArray,target);
        System.out.println(result);
    }
}
