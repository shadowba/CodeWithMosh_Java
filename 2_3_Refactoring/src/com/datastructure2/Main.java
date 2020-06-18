package com.datastructure2;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();
        int[] inputArray = new int[]{10,5,15,6,1,8,12,18,17};
        for(int item:inputArray){
            BST.insert(item);
        }

        BinarySearchTree BST2 = new BinarySearchTree();
        int[] inputArray2 = new int[]{10,5,15,2,1,3};
        for(int item:inputArray2){
            BST2.insert(item);
        }
//        System.out.println(BST.min());
//        System.out.println(BST.find(18));


        System.out.println(BST.equals(BST2));
        System.out.println(BST2.validatingBST());

        BST.valueFromDistance(BST.root,2);
        System.out.println(BST.getValueStack().toString());
    }
}
