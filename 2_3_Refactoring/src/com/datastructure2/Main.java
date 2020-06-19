package com.datastructure2;

public class Main {
    public static void main(String[] args) {

//        -------- Lesson2 Binary Tree --------
//        BinarySearchTree BST = new BinarySearchTree();
//        int[] inputArray = new int[]{10,5,15,6,1,8,12,18,17};
//        for(int item:inputArray){
//            BST.insert(item);
//        }
//
//        BinarySearchTree BST2 = new BinarySearchTree();
//        int[] inputArray2 = new int[]{10,5,15,2,1,3};
//        for(int item:inputArray2){
//            BST2.insert(item);
//        }
//        System.out.println(BST.min());
//        System.out.println(BST.find(18));
//
//
//        System.out.println(BST.equals(BST2));
//        System.out.println(BST2.validatingBST());
//
//        BST.valueFromDistance(BST.root,2);
//        System.out.println(BST.getValueStack().toString());
//
//        System.out.println(BST.areSibling(12,18));

//        -------- Lesson2 Binary Tree --------

        AVLTree avlTree = new AVLTree();

        avlTree.insert(10);
        avlTree.insert(5);
        avlTree.insert(15);
        avlTree.insert(6);
        avlTree.insert(1);
        avlTree.insert(8);
        avlTree.insert(12);
        avlTree.insert(18);
        avlTree.insert(17);

        System.out.println("End");


    }
}
