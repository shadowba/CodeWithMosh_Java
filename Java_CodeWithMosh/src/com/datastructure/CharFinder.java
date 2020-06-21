package com.datastructure;

import java.util.HashMap;
import java.util.Map;

public class CharFinder {
    Map<Character, Integer> charMap = new HashMap<>();
    private String inputStr;

    public char findNoRepeatedChar() {
        int index = 0;
        char[] chars = inputStr.toCharArray();
        for (char item : inputStr.toCharArray()) {
            if (!charMap.containsKey(item)) {
                charMap.put(item, 1);
            } else {
                charMap.put(item, charMap.get(item) + 1);
            }
        }
        for (char ch : chars)
            if (charMap.get(ch) == 1)
                return ch;

        return Character.MIN_VALUE;
//        for(var key:charMap.keySet()){
//            if(charMap.get(key.charValue())==1) {
//                System.out.println(key.charValue());
//            }
//        }
    }

    public void setInputStr(String inputString) {
        this.inputStr = inputString;
    }
}
