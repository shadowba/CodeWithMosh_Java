package com.datastructure;

public class LinkedList {
    private Node first;
    private Node last;
    private int size = 0;

    public void addFirst(int value) {
        size++;
        Node newMember = new Node(value);
        if (first == null && last == null) {
            first = newMember;
            last = newMember;
        } else {
            newMember.setNext(first);
            first = newMember;
        }
    }

    public void addLast(int value) {
        size++;
        Node newMember = new Node(value);
        if (first == null && last == null) {
            first = newMember;
            last = newMember;
        } else {
            last.setNext(newMember);
            last = newMember;
        }
    }

    public void deleteFirst() {
        Node oldFirst = first;
        if (first == null && last == null) {
            throw new IllegalStateException("No element in the list");
        }
        first = oldFirst.getNext();
        oldFirst.setNext(null);
        size--;
    }

    public void deleteLast() {
        Node current = first;
        if (first == null && last == null) {
            throw new IllegalStateException("No element in the list");
        }
        if (first == last) {
            first.setNext(null);
            first = null;
            last = null;
        } else {
            Node previous= getPrevious(first);
            previous.setNext(null);
            last=previous;
        }
        size--;
    }

    private Node getPrevious(Node first){
        Node current = first;
        Node previous=null;
        while (current.getNext() != null) {
            previous=current;
            current = current.getNext();
        }
        return previous;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public int indexOf(int item) {
        int index = 0;
        Node iterator = first;
        Node before_iterator;
        while (iterator != null) {
            if (iterator.getValue() == item)
                return index;
            index++;
            iterator = iterator.getNext();
        }
        return -1;
    }

    public int Size(){
        return size;
    }

    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        public Node getNext() {
            return next;
        }
        public int getValue() {
            return value;
        }
    }
}
