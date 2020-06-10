package com.datastructure;

import java.util.Stack;

public class StringReverser {

    public String Reverse(String input) {
        if (input==null)
            throw new IllegalArgumentException();

//        char[] inputArray = input.toCharArray();
        Stack<Character> inputStack = new Stack<>();

        for (char ch:input.toCharArray()){
            inputStack.push(ch);
        }
//        for (int i = 0; i < inputArray.length; i++) {
//            inputStack.push(inputArray[i]);
//        }

//        char[] inputArrayReversed = new char[inputArray.length];
//        for (int i = 0; i < inputArray.length; i++) {
//            inputArrayReversed[i] = inputStack.pop();
//        }
        StringBuffer strBuffer=new StringBuffer();
        while (!inputStack.empty())
            strBuffer.append(inputStack.pop());

        return strBuffer.toString();
    }
}
