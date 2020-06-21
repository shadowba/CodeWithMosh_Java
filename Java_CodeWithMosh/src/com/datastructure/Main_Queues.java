package com.datastructure;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main_Queues {
    public static void main(String[] args) {
//        ------------- QueueReverser --------------
//        Queue<Integer> inputQueue=new ArrayDeque<>();
//        inputQueue.add(10);
//        inputQueue.add(20);
//        inputQueue.add(30);
//        System.out.println(inputQueue);
//        QueueReverser.reverse(inputQueue);
//        System.out.println(inputQueue);

//        ------------- ArrayQueue --------------
//        ArrayQueue newQueue=new ArrayQueue();
//        System.out.println(newQueue.isEmpty());
//        System.out.println(newQueue.isFull());
//        newQueue.enqueue(10);
//        newQueue.enqueue(20);
//        newQueue.enqueue(30);
//        newQueue.enqueue(40);
//        System.out.println(newQueue.toString());
//        newQueue.enqueue(50);
//        System.out.println(newQueue.isFull());
//        System.out.println(newQueue.dequeue());
//        System.out.println(newQueue.dequeue());
//        System.out.println(newQueue.dequeue());
//        System.out.println(newQueue.dequeue());
//        System.out.println(newQueue.dequeue());
//        System.out.println(newQueue.toString());
//        System.out.println(newQueue.isEmpty());
////        System.out.println(newQueue.peek());
//        System.out.println(newQueue.isFull());
//        newQueue.enqueue(10);
//        System.out.println(newQueue.peek());
//        newQueue.enqueue(20);
//        newQueue.enqueue(30);
//        System.out.println(newQueue.peek());
//        newQueue.enqueue(40);
//        newQueue.enqueue(50);
//        System.out.println(newQueue.toString());

//        ------------- StackQueue --------------
//        StackQueue stackQue=new StackQueue();
//        stackQue.enque(10);
//        stackQue.enque(20);
//        stackQue.enque(30);
//        System.out.println(stackQue.deque());
//        System.out.println(stackQue.deque());
//        stackQue.enque(40);
//        stackQue.enque(50);
//        stackQue.enque(60);
//        System.out.println(stackQue.deque());
//        System.out.println(stackQue.deque());
//        System.out.println(stackQue.deque());
//        System.out.println(stackQue.deque());

//        ------------- PriorityQueue --------------
        PriorityQueue newQueue = new PriorityQueue();
        newQueue.enQueue(5);
        newQueue.enQueue(3);
        newQueue.enQueue(6);
        newQueue.enQueue(1);
        newQueue.enQueue(4);
        System.out.println(newQueue.toString());
        newQueue.enQueue(2);
        System.out.println(newQueue.toString());
        newQueue.enQueue(5);
        newQueue.enQueue(7);
        newQueue.enQueue(8);
        System.out.println(newQueue.toString());
        newQueue.enQueue(6);
        System.out.println(newQueue.toString());

        while (!newQueue.isEmpty()){
            System.out.println(newQueue.deQueue());
        }

    }
}
