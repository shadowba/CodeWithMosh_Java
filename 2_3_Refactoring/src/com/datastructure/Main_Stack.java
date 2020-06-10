package com.datastructure;

import java.util.Arrays;
import java.util.Stack;

public class Main_Stack {
    public static void main(String[] args) {
        Character chr='M';
        String str=")a+b(";
        Expression exp=new Expression();
        boolean result= exp.isBalanced(str);
        System.out.println(result);
//        System.out.println(chr);
//        result=(chr!='N')?true:false;
//        System.out.println(result);
    }
}
