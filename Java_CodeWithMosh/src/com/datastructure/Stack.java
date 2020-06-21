package com.datastructure;

import java.util.Arrays;

public class Stack {
    int[] item = new int[1];
    private int numberOfItems = 0;

    public void push(int member) {
        item[numberOfItems++] = member;
        if (numberOfItems == item.length) {
            item = Arrays.copyOf(item, numberOfItems * 2);
        }
    }

    public int pop() {
        int result=item[numberOfItems-1];
        item[--numberOfItems]=0;
        return result;
    }

    public int peek() {
        return item[numberOfItems - 1];
    }

    public boolean isEmpty() {
        return numberOfItems == 0;
    }

    public int size() {
        return numberOfItems;
    }

    public int[] toArray() {
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(item,0,numberOfItems));
    }

}
