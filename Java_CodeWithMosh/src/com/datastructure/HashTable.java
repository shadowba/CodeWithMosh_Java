package com.datastructure;

import java.util.LinkedList;

public class HashTable {
    LinkedList<Entry>[] hashLinks = new LinkedList[5];

    public void put(int k, String v) {
        Entry newEntry = new Entry(k, v);
        isCollision(newEntry);
    }

    public LinkedList<Entry> get(int k) {
        for (LinkedList<Entry> link : hashLinks) {
            if (link.getFirst().key == k)
                return link;
        }
        throw new IllegalArgumentException("No key match");
    }

    public void remove(int k) {
        for (int i = 0; i < hashLinks.length; i++) {
            if (hashLinks[i].peekFirst().key == k) {
                hashLinks[i] = null;
                return;
            }
        }
        throw new IllegalArgumentException("No key match");
    }

    private void isCollision(Entry newItem) {
        int index = hash(newItem.key);

        if (hashLinks[index] == null) {
            LinkedList<Entry> newLink = new LinkedList<>();
            newLink.addLast(newItem);
            hashLinks[index] = newLink;
            return;
        }

        for(Entry item:hashLinks[index]){
            if(item.key==newItem.key){
                item.value=newItem.value;
                return;
            }
        }
        hashLinks[index].addLast(newItem);
    }

//    private boolean isFull() {
//        return findEmptyIndex()==-1;
//    }

    private int hash(int i) {
        return (i % hashLinks.length);

//        for(int i=0;i<hashLinks.length;i++){
//            if(hashLinks[i]==null)
//                return i;
//        }
//        return -1;
    }

    private class Entry {
        private int key;
        private String value;

        private Entry(int k, String v) {
            this.key = k;
            this.value = v;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value='" + value + '\'' +
                    '}';
        }
    }


}
