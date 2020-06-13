package com.datastructure;

import java.util.Arrays;

public class ArrayQueue {
    int[] inputArray;
    int front;
    int last;

    public void enqueue(int newItem) {
        if(isFull())
            throw new IllegalArgumentException("ArrayQueue is full.");
        if(isEmpty())
            inputArray=new int[5];
        inputArray[last++] = newItem;
    }

    public int dequeue() {
        if(isEmpty())
            throw new IllegalArgumentException("ArrayQueue is empty.");
        int result=inputArray[0];
        inputArray =Arrays.copyOfRange(inputArray,1,last--);
        return result;
    }

    public boolean isEmpty() {
        return front == last;
    }

    public boolean isFull(){
        return last==5;
    }

    @Override
    public String toString() {
        return Arrays.toString(inputArray);
    };

    public int peek(){
        if(isEmpty())
            throw new IllegalArgumentException("ArrayQueue is empty");
        return inputArray[0];
    }
}
