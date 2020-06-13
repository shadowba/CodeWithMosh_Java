package com.datastructure;

import java.util.Arrays;

public class Main_Stack {
    public static void main(String[] args) {
        Character chr = 'M';
        String str = ")a+b(";
        Expression exp = new Expression();
        boolean result = exp.isBalanced(str);
        System.out.println(result);
//        System.out.println(chr);
//        result=(chr!='N')?true:false;
//        System.out.println(result);

        System.out.println("----- Stack(array) ------");
        Stack testStack = new Stack();
        System.out.println(testStack.isEmpty());
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        testStack.push(4);
        testStack.push(5);

        System.out.println(testStack.peek());
        System.out.println(testStack.toString());
        System.out.println(testStack.size());
        System.out.println(testStack.pop());
        System.out.println(testStack.size());
        System.out.println(testStack.toString());
    }
}
