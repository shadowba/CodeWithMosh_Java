package com.datastructure3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class StringManipulation {
    public int findNumOfVowels(String str) {
        str = str.toUpperCase();
        char[] inputArray = str.toCharArray();
        var map = new HashMap<>();

        int i = 0;
        for (char ch : inputArray) {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                i++;
        }
        return i;
    }

    public char[] reverseString(String str) {
        char[] inputArray = str.toCharArray();
        var tempStack = new Stack<Character>();

        for (char ch : inputArray)
            tempStack.push(ch);

        for (int i = 0; i < inputArray.length; i++)
            inputArray[i] = tempStack.pop();

        return inputArray;
    }

    public String reverseSentence(String str) {
        String[] strArray = str.split(" ");
        String outStr="";
        var tempStack = new Stack<String>();
        for (String ch : strArray)
            tempStack.push(ch.trim());

        for (int i = 0; i < strArray.length - 1; i++)
            outStr = outStr + tempStack.pop() + " ";
        outStr += tempStack.pop();

        return outStr;
    }
}
