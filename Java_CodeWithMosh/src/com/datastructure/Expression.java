package com.datastructure;

import java.util.Stack;

public class Expression {
    public boolean isBalanced(String input){
        Stack<Character> inputStack=new Stack<>();
        Character temp;
        for(Character ch:input.toCharArray()){
            if(isOpenBracket(ch))
                inputStack.push(ch);
            if(isCloseBracket(ch)){
                if(inputStack.empty()){
                    return false;
                }
                temp=inputStack.pop();
                if(!isMatch(ch,temp))
                    return false;
            }
        }
        if(!inputStack.empty())
            return false;
        return true;
    }

    private boolean isOpenBracket(Character ch) {
        switch (ch){
            case '(':
            case'[':
            case '{':
            case'<':
                return true;
            default:
                return false;

        }
    }

    private boolean isCloseBracket(Character ch) {
        switch (ch){
            case ')':
            case']':
            case '}':
            case'>':
                return true;
            default:
                return false;

        }
    }

    private boolean isMatch(Character close, Character open){
        switch (close){
            case ')':
                if(open=='(')
                    return true;
            case ']':
                if(open=='[')
                    return true;
            case '}':
                if(open=='{')
                    return true;
            case '>':
                if(open=='<')
                    return true;
            default:
                return false;
        }
    }
}
