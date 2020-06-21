package com.datastructure;

import java.util.Arrays;

public class PriorityQueue {
    int[] inputArray=new int[5];
    int last=-1;

    public void enQueue(int item){
        if(isFull()){
            inputArray= Arrays.copyOf(inputArray,inputArray.length*2);
        }
        if(isEmpty()) {
            inputArray[++last] = item;
            return;
        }
        for (int i = last++; i > -1; i--) {
            if (inputArray[i] >= item) {
                inputArray[i + 1] = inputArray[i];
                inputArray[i] = item;
            }
            else {
                inputArray[i+1] = item;
                break;
            }
        }

    }

    public int deQueue(){
        if(isEmpty()){
            throw new IllegalArgumentException();
        }
        int result=inputArray[last];
        inputArray[last--]=0;
        return result;
    }

    public boolean isFull(){
        return inputArray.length==(last+1);
    }

    public boolean isEmpty(){
        return last==-1;
    }

    @Override
    public String toString() {
        return Arrays.toString(inputArray);
    }
}
