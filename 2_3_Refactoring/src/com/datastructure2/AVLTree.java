package com.datastructure2;

public class AVLTree {
    private AVLNode root;

    public void insert(int value) {
        root = insert(root, value);
        balanceFactor(root);

    }

    private AVLNode insert(AVLNode root, int value) {
        if (root == null) {
            root = new AVLNode(value);
            root.height = getHeight(root);
            return root;
        }

        if (value > root.value) {
            root.rightChild = insert(root.rightChild, value);
        } else {
            root.leftChild = insert(root.leftChild, value);
        }
        root.height = Math.max(getHeight(root.leftChild), getHeight(root.rightChild)) + 1;

        return root;
    }

    private int getHeight(AVLNode node) {
        return node==null?-1:node.height;
//        if (node == null)
//            return -1;
//        if (isLeaf(node))
//            return 0;
//        return Math.max(getHeight(node.leftChild), getHeight(node.rightChild)) + 1;
    }

    private void balanceFactor(AVLNode root){
        root.balanceFactor=getHeight(root.leftChild)-getHeight(root.rightChild);
        if(root.balanceFactor>1)
            System.out.println("Root "+root.toString()+" is left heavy");
        else if(root.balanceFactor<-1)
            System.out.println("Root "+root.toString()+" is right heavy");
    }

    private boolean isLeaf(AVLNode root) {
        return root.leftChild == null && root.rightChild == null;
    }

    private class AVLNode {
        int value;
        AVLNode leftChild;
        AVLNode rightChild;
        int height;
        int balanceFactor;

        public AVLNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value=" + value + ", height=" + height + ", balanceFactor=" + balanceFactor;
        }
    }
}
