package com.datastructure3;

public class test_StringManipulation {
    public static void main(String[] args) {
        var strProcess=new StringManipulation();
        String inputStr="hello";
        String inputSentence="Trees are beautiful";
        System.out.println(strProcess.findNumOfVowels(inputStr));
        System.out.println(strProcess.reverseString(inputStr));
        System.out.println(strProcess.reverseSentence(inputSentence));
    }
}
