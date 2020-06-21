package com.datastructure;

import java.util.Stack;

public class StackQueue {
    private Stack<Integer> stackFirst = new Stack<>();
    private Stack<Integer> stackSecond = new Stack<>();

    public void enque(int item){
        stackFirst.push(item);
    }

    public int deque(){
        if(stackSecond.empty()){
            while(!stackFirst.empty()){
                stackSecond.push(stackFirst.pop());
            }
        }
        return stackSecond.pop();
    }
}
