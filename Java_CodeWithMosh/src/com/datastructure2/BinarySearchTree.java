package com.datastructure2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class BinarySearchTree {
    Node root = null;
    Node current = null;
    LinkedList<Integer> treeLinkedList = new LinkedList<>();
    Stack<Integer> valueStack = new Stack<>();

    public void insert(int newValue) {
        Node newNode = new Node(newValue);
        current = root;
        if (root == null) {
            root = newNode;
            return;
        }

        while (current != null) {
            if (newNode.getValue() <= current.getValue()) {
                if (current.getLeftChild() == null) {
                    current.setLeftChild(newNode);
                    break;
                } else
                    current = current.getLeftChild();
            } else {
                if (current.getRightChild() == null) {
                    current.setRightChild(newNode);
                    break;
                } else
                    current = current.getRightChild();
            }
        }

    }

    public boolean find(int lookValue) {
        current = root;
        while (current != null) {
            if (lookValue < current.getValue()) {
                current = current.getLeftChild();
            } else if (lookValue > current.getValue()) {
                current = current.getRightChild();
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean equals(BinarySearchTree newTree) {
//        treeLinkedList = this.getLinkedList();
        convertTreeLinkList(root, treeLinkedList);
        System.out.println(treeLinkedList);

        LinkedList<Integer> newTreeLinkedList = new LinkedList<>();
        convertTreeLinkList(newTree.getRoot(), newTreeLinkedList);
//        newTreeLinkedList = newTree.getLinkedList();
        System.out.println(newTreeLinkedList);

        int maxSize = Math.max(treeLinkedList.size(), newTreeLinkedList.size());
        for (int i = 0; i < maxSize; i++) {

            if (treeLinkedList.size() != newTreeLinkedList.size() ||
                    treeLinkedList.toArray()[i] != newTreeLinkedList.toArray()[i])
                return false;
        }
        return true;
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traverseInOrder(Node root) {
        if (root == null)
            return;

        traverseInOrder(root.getLeftChild());
        System.out.println(root.getValue());
        traverseInOrder(root.getRightChild());
    }

    private void traversePreOrder(Node root) {
        if (root == null)
            return;

        System.out.println(root.getValue());
        traverseInOrder(root.getLeftChild());
        traverseInOrder(root.getRightChild());
    }

    private void traversePostOrder(Node root) {
        if (root == null)
            return;

        traverseInOrder(root.getLeftChild());
        traverseInOrder(root.getRightChild());
        System.out.println(root.getValue());
    }

    private void convertTreeLinkList(Node root, LinkedList list) {
        if (root == null)
            return;

        convertTreeLinkList(root.getLeftChild(), list);
        convertTreeLinkList(root.getRightChild(), list);
        list.add(root.value);
    }

    public LinkedList getLinkedList() {
        return treeLinkedList;
    }

    public Node getRoot() {
        return root;
    }

    private int height(Node root) {
        if (root == null)
            return -1;

        if (root.getLeftChild() == null && root.getRightChild() == null)
            return 0;

        return 1 + Math.max(height(root.getLeftChild()), height(root.getRightChild()));
    }

    public int min() {
        return min(root);
    }

    private int min(Node root) {

        if (root.getLeftChild() == null || root.getRightChild() == null)
            return root.getValue();

        int left = min(root.leftChild);
        int right = min(root.rightChild);

        return Math.min(Math.min(left, right), root.getValue());
    }

//    private void traverseLimitSettings(Node root, double maxLimit, double minLimit) {
//        if (root == this.root) {
//            root.maxLimit = Double.POSITIVE_INFINITY;
//            root.minLimit = Double.NEGATIVE_INFINITY;
//            return;
//        }
//        root.maxLimit = maxLimit;
//        root.minLimit = minLimit;
//        if (root.getLeftChild() != null)
//            traverseLimitSettings(root.getLeftChild(), root.value, root.minLimit);
//        if (root.getRightChild() != null)
//            traverseLimitSettings(root.getRightChild(), root.maxLimit, root.value);
//    }

    public boolean validatingBST() {
        return validatingBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    private boolean validatingBST(Node root, int maxLimit, int minLimit) {
//        traverseLimitSettings(this.root,Double.POSITIVE_INFINITY,Double.NEGATIVE_INFINITY);
//        if(root==null)
//            return false;
//        if(root.getLeftChild()!=null)
//            return validatingBST(root.getLeftChild());
//        else if(root.getRightChild()!=null)
//            return validatingBST(root.getRightChild());
//        else
//            return (root.value<=root.maxLimit&&root.value>=root.minLimit);

        if (root == null)
            return false;
        if (root.value > maxLimit || root.value < minLimit)
            return false;

        return validatingBST(root.getLeftChild(), root.value + 1, minLimit) && validatingBST(root.getRightChild(), maxLimit, root.value + 1);
    }

    public void valueFromDistance(Node root, int distance) {
        if (root == null)
            return;
//            return -1;

        if (distance == 0) {
            valueStack.push(root.value);
            return;
        } else {
            valueFromDistance(root.getLeftChild(), distance - 1);
            valueFromDistance(root.getRightChild(), distance - 1);
        }
    }

    Stack<Integer> getValueStack() {
        return valueStack;
    }

    public int size() {
        return size(root);
    }

    private int size(Node root) {
        if (root == null)
            return 0;
        if (isLeaf(root))
            return 1;

        return 1 + size(root.getLeftChild()) + size(root.getRightChild());
    }

    public int countLeaves() {
        return countLeaves(root);
    }

    private int countLeaves(Node root) {
        if (root == null)
            return 0;
        if (isLeaf(root))
            return 1;
        return countLeaves(root.getLeftChild()) + countLeaves(root.getRightChild());
    }

    public int max() {
        if (root == null)
            return -1;
        return max(root);
    }

    private int max(Node root) {
        if (root.getRightChild() == null)
            return root.value;
        return max(root);
    }

    public boolean contains(int value) {
        return contains(root, value);
    }

    private boolean contains(Node root, int value) {
        if (root == null)
            return false;

        if (root.value == value)
            return true;
        else
            return contains(root.getLeftChild(), value) || contains(root.getRightChild(), value);

    }

    public boolean areSibling(int value1, int value2) {
        return areSibling(root, value1, value2);
    }

    private boolean areSibling(Node root, int value1, int value2) {
        if (root.getLeftChild() == null || root.getRightChild() == null)
            return false;
        if (root.getLeftChild().value == value1 && root.getRightChild().value == value2)
            return true;
        if (root.getLeftChild().value == value2 && root.getRightChild().value == value1)
            return true;
        return areSibling(root.getLeftChild(), value1, value2) || areSibling(root.getRightChild(), value1, value2);
    }

    private void getAncestors(Node root,int value,LinkedList linkedList){
        if (root==null)
            return;
        if(root.getRightChild().value==value||root.getLeftChild().value==value){
            linkedList.add(root.value);
        }

    }

    private boolean isLeaf(Node root) {
        return root.getLeftChild() == null && root.getRightChild() == null;
    }

    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;
        private double maxLimit;
        private double minLimit;

        public Node(int value) {
            this.value = value;
        }

        public void setLeftChild(Node newLeftChild) {
            this.leftChild = newLeftChild;
        }

        public void setRightChild(Node newRightChild) {
            this.rightChild = newRightChild;
        }

        public int getValue() {
            return value;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }
    }
}
