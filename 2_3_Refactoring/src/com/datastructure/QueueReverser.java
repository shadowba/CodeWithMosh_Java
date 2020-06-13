package com.datastructure;

import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
    public static void reverse(Queue<Integer> inputQueue){
        Stack<Integer> tempStack=new Stack<>();
        int size=inputQueue.size();
        for(int i=0;i<size;i++)
            tempStack.push(inputQueue.remove());

        while (!tempStack.empty()){
            inputQueue.add(tempStack.pop());
        }
        
    }

}
