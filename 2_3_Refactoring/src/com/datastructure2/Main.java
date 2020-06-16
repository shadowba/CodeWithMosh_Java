package com.datastructure2;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();
        int[] inputArray = new int[]{10,5,15,6,1,8,12,18,17};
        for(int item:inputArray){
            BST.insert(item);
        }
        System.out.println(BST.find(18));
    }
}
