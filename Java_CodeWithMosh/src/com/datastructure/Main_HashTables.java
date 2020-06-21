package com.datastructure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;

public class Main_HashTables {

    public static void main(String[] args) {
//        ---------- findNoRepeatedChar --------
//        String inputStr="a green apple";
//        CharFinder charFinder= new CharFinder();
//        charFinder.setInputStr(inputStr);
//        System.out.println(charFinder.findNoRepeatedChar());

//        ---------- findFirstRepeatedChar --------
//        findFirstRepeatedChar hashSetChar=new findFirstRepeatedChar("xayzb mn");
//        char item=hashSetChar.finder();
//        System.out.println(item);

//        ---------- findFirstRepeatedChar --------
        HashTable hashTable=new HashTable();
        hashTable.put(1,"A");
        hashTable.put(2,"2-1");
        hashTable.put(6,"C");
        hashTable.put(6,"D");
//        hashTable.put(3,"3-1");
//        hashTable.put(5,"5-1");
//        hashTable.put(4,"4-2");
//        hashTable.put(4,"4-3");
//        hashTable.remove(4);
//        hashTable.put(6,"6-1");
//        hashTable.put(6,"6-2");
//        hashTable.put(6,"6-3");
//        hashTable.put(7,"7-1");
        System.out.println(hashTable.get(6).toString());
    }
}
