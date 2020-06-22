package com.datastructure2;

import com.datastructure.HashTable;

import java.util.HashMap;

public class Trie {
    private Node root = new Node(Character.MIN_VALUE);
    private Node current;

//    public void traverse(){
//        traverse(root);
//    }
//
//    private void traverse(Node root){
//        System.out.println(root.value);
//
//        for(Node child:root.getChildren())
//            traverse(child);
//    }

    private void postTraverseNode(Node root, char ch) {
        if (root.hasNoChild())
            return;

        for (Node child : root.getChildren()) {
            postTraverseNode(child, ch);
            if (root.hasChild(ch))
                root.getChild(ch).isEndOfWord = false;
            if (root.getChild(ch).hasNoChild())
                root.getChild(ch).value = Character.MIN_VALUE;
        }

    }

    public void remove(String str) {
        if (!contains(str) || str == null)
            throw new IllegalArgumentException("No such word");

        char[] strToChar = str.toCharArray();
        boolean endOfString = false;
        Node current = root;
        for (int i = 0; i < strToChar.length; i++) {
            if (i == strToChar.length - 1)
                endOfString = true;
            current = remove(current, strToChar[i], endOfString);
        }
    }

    private Node remove(Node root, char ch, boolean end) {
        if (root.hasChild(ch) && !end) {
            return root.getChild(ch);
        }
        root.getChild(ch).isEndOfWord = false;
        if (root.getChild(ch).hasNoChild())
            root.getChild(ch).value = Character.MIN_VALUE;
        return root;
    }


//    public void remove(String str) {
//        if (!contains(str))
//            throw new IllegalArgumentException("No such word");
//        char lastChar = str.toCharArray()[str.length() - 1];
//        postTraverseNode(root, lastChar);
////
////        if(target==null)
////            throw new IllegalArgumentException("No such word2");
////        target.isEndOfWord=false;
////        if(target.hasNoChild())
////            target=null;
//    }

    public void insert(String str) {
        current = root;
        for (char ch : str.toCharArray()) {
            if (!current.hasChild(ch))
                current.addChild(ch);
            current = current.getChild(ch);
        }
        current.isEndOfWord = true;
    }

    public boolean contains(String str) {
        if (str == null)
            return false;

        current = root;
        int size = str.length();
        char ch;
        for (int i = 0; i < size; i++) {
            ch = str.toCharArray()[i];
            if (!current.hasChild(ch))
                return false;
            if (i == size - 1)
                return current.getChild(ch).isEndOfWord == true ? true : false;
            current = current.getChild(ch);
        }
        return false;
    }

    private class Node {
        private char value;
        private HashMap<Character, Node> children = new HashMap<>();
        private boolean isEndOfWord;

        private Node(char value) {
            this.value = value;
        }

        private boolean hasNoChild() {
            return children.isEmpty();
        }

        private boolean hasChild(char ch) {
            return children.containsKey(ch);
        }

        private void addChild(char ch) {
            children.put(ch, new Node(ch));
        }

        private Node getChild(char ch) {
            return children.get(ch);
        }

        private Node[] getChildren() {
            return children.values().toArray(new Node[0]);
        }

        @Override
        public String toString() {
            return Character.toString(value);
        }
    }
}
