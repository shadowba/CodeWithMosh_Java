package com.datastructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class findFirstRepeatedChar {
    private String inputStr;
    private Set<Character> hashChar = new HashSet<>();

    public findFirstRepeatedChar(String inputStr) {
        this.inputStr = inputStr;
    }

    public char finder() {
        for (char item : inputStr.toCharArray()) {
            if (hashChar.contains(item))
                return item;
            else
                hashChar.add(item);

        }
        return Character.MIN_VALUE;
    }

}
