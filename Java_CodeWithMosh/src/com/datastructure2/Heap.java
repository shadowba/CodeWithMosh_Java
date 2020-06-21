package com.datastructure2;

import java.util.ArrayList;

public class Heap {
    ArrayList<Integer> heap = new ArrayList<>();

    public void insert(int value) {
        heap.add(value);
        bubbleUp(heap.size() - 1);
    }

    public void remove(int value) {
        int targetIndex = heap.indexOf(value);
        if (targetIndex != -1) {
            heap.set(targetIndex, heap.get(heap.size() - 1));
            heap.remove(heap.size() - 1);
            bubbleDown(targetIndex);
        } else
            throw new IllegalArgumentException("No such element");
    }

    public int remove(){
        int targetIndex = 0;
        int output=heap.get(targetIndex);
        if (targetIndex != -1) {
            heap.set(targetIndex, heap.get(heap.size() - 1));
            heap.remove(heap.size() - 1);
            if(heap.size()==0)
                return output;

            bubbleDown(targetIndex);
            return output;
        } else
            throw new IllegalArgumentException("No such element");
    }

    public int size(){
        return heap.size();
    }

    private void bubbleUp(int index) {
        if (index == 0)
            return;

        int parent = getParentIndex(index);
        if (heap.get(parent) < heap.get(index)) {
            exchangeValue(index, parent);
        }

        bubbleUp(parent);
    }

    private void bubbleDown(int index) {
        int leftChild = getLeftChildIndex(index);
        int rightChild = getRightChildIndex(index);

        if (heap.get(leftChild) <= heap.get(index) && heap.get(rightChild) <= heap.get(index))
            return;
        int nextIndex = getLargerChildIndex(index);
        exchangeValue(nextIndex, index);
        bubbleDown(nextIndex);
    }

    private int getLargerChildIndex(int index) {
        int leftChild = getLeftChildIndex(index);
        int rightChild = getRightChildIndex(index);
//        int maxIndex = heap.size() - 1;
//        if (leftChild > maxIndex)
//            return index;
//        if (rightChild > maxIndex)
//            return leftChild;
        return heap.get(leftChild) >= heap.get(rightChild) ? leftChild : rightChild;
    }

    private void exchangeValue(int index, int targetIndex) {
        int temp = heap.get(index);
        heap.set(index, heap.get(targetIndex));
        heap.set(targetIndex, temp);
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private int getLeftChildIndex(int index) {
        int maxIndex = heap.size() - 1;
        int leftChild=index * 2 + 1;
        if (leftChild > maxIndex)
            return index;
        return leftChild;
    }

    private int getRightChildIndex(int index) {
        int maxIndex = heap.size() - 1;
        int rightChild=index * 2 + 2;
        if (rightChild > maxIndex)
            return getLeftChildIndex(index);
        return rightChild;
    }

    @Override
    public String toString() {
        return heap.toString();
    }

}
