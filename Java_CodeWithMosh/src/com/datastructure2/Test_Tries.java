package com.datastructure2;

import java.util.Arrays;

public class Test_Tries {
    public static void main(String[] args) {
        Trie newTrie=new Trie();

        newTrie.insert("cat");
//        newTrie.traverse();
        newTrie.insert("car");
//        newTrie.traverse();
        newTrie.insert("canada");
//        newTrie.traverse();

        System.out.println(newTrie.contains("can"));
        newTrie.insert("can");
        System.out.println(newTrie.contains("can"));
        System.out.println(newTrie.contains("abc"));
        System.out.println(newTrie.contains(null));

        newTrie.remove("cat");
        newTrie.remove("can");

        System.out.println("END");

    }
}
