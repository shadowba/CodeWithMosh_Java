package com.datastructure2;

import com.datastructure.Array;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;

public class Graph {
    Hashtable<String, Integer> memberTable = new Hashtable<>();
    ArrayList<LinkedList<Node>> listGraph = new ArrayList<>();
    int size;

    public void addNode(String label) {
        memberTable.putIfAbsent(label, size);
        listGraph.add(size, new LinkedList<Node>());
        size++;
    }

    public void removeNode(String label) {
        if (!memberTable.contains(label))
            throw new IllegalArgumentException("Non existing member");
        var index = memberTable.get(label);
        memberTable.remove(label);
        listGraph.remove(index);
        for (var list : listGraph) {
            for (Node member : list) {
                if (member.label == label) {
                    list.remove(member);
                    break;
                }
            }
        }
    }

    public void addEdge(String from, String to) {
        if (!memberTable.containsKey(from) || !memberTable.containsKey(to))
            throw new IllegalArgumentException("Non existing member");

        var index = memberTable.get(from);
        var edgeList = listGraph.get(index);
        edgeList.add(new Node(to));
    }

    public void removeEdge(String from, String to) {
        var fromIndex = memberTable.get(from);
        var list = listGraph.get(fromIndex);
        for (Node member : list) {
            if (member.label == to) {
                list.remove(member);
                break;
            }
        }
    }

    public void print() {
        int index=0;
        String member;
        for(Object key:memberTable.keySet().toArray()) {
            member=(String) key;
            index=memberTable.get(member);
            System.out.println(member + " is connected with " + listGraph.get(index).toString());
        }
    }

    private class Node {
        String label;

        public Node(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }
}
