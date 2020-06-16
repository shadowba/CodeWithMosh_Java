package com.datastructure2;

public class BinarySearchTree {
    Node root = null;
    Node current = null;

    public void insert(int newValue) {
        Node newNode = new Node(newValue);
        current = root;
        if(root==null){
            root=newNode;
            return;
        }

        while (current != null) {
            if (newNode.getValue() <= current.getValue()) {
                if(current.getLeftChild()==null){
                    current.setLeftChild(newNode);
                    break;
                }
                else
                    current=current.getLeftChild();
            } else {
                if(current.getRightChild()==null){
                    current.setRightChild(newNode);
                    break;
                }
                else
                    current=current.getRightChild();
            }
        }

    }

    public boolean find(int lookValue) {
        current = root;
        while (current != null) {
            if (lookValue < current.getValue()) {
                current = current.getLeftChild();
            } else if(lookValue>current.getValue()){
                current = current.getRightChild();
            }else{
                return true;
            }
        }
        return false;
    }

    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

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
