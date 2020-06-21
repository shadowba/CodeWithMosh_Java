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
        if (first == null && last == null) {
            throw new IllegalStateException("No element in the list");
        }
        Node oldFirst = first;
        first = oldFirst.getNext();
        oldFirst.setNext(null);
        size--;
        if (this.Size() == 0) {
            first = null;
            last = null;
        }
    }

    public void deleteLast() {
        if (first == null && last == null) {
            throw new IllegalStateException("No element in the list");
        }
        Node current = first;
        if (first == last) {
            first.setNext(null);
            first = null;
            last = null;
        } else {
            Node previous = getLastPrevious(first);
            previous.setNext(null);
            last = previous;
        }
        size--;
        if (this.Size() == 0) {
            first = null;
            last = null;
        }
    }

    private Node getLastPrevious(Node first) {
        Node current = first;
        Node previous = null;
        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
        }
        return previous;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public int indexOf(int item) {
        if (first == null && last == null)
            throw new IllegalStateException("No element in the list");
        Node current = first;
        int index = 0;
        if (first == last) {
            if (first.getValue() == item)
                return 0;
            else
                return -1;
        } else {
            while (current.getNext() != null) {
                if (current.getValue() == item)
                    return index;
                index++;
                current = current.getNext();
            }
            if (current.getValue() == item)
                return index;
            else
                return -1;
        }
    }

    public int Size() {
        return size;
    }

    public int[] toArray() {
        if (size == 0)
            throw new IllegalStateException(" No element in the list ");
        int[] array = new int[size];
        Node current = first;
        for (int i = 0; i < size; i++) {
            array[i] = current.getValue();
            current = current.getNext();
        }
        return array;
    }

    public void reverse() {
        Node previous=first;
        Node current=first.getNext();
        Node next;
        while(current!=null){
            next=current.getNext();
            current.setNext(previous);
            previous=current;
            current=next;
        }
        last=first;
        last.setNext(null);
        first=previous;
    }

    public void printMiddle() {
        if (size == 0)
            throw new IllegalArgumentException();
        Node A = first;
        Node B = first;
        while (B != null && B.getNext() != null) {
            if(B.getNext().getNext()==null){
                System.out.print(A.getNext().getValue()+" + ");
                break;
            }
            A = A.getNext();
            B = B.getNext().getNext();
        }
        System.out.println(A.getValue());
    }

    public class Node {
        private int value;
        private Node next;
        private Node previous;

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

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public Node getPrevious() {
            return previous;
        }
    }
}
