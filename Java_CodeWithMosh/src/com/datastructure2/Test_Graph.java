package com.datastructure2;

public class Test_Graph {
    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.addNode("A");
        graph.addNode("C");
        graph.addNode("B");

        graph.addEdge("A","B");
        graph.addEdge("A","C");
        graph.addEdge("B","A");
        graph.print();
    }
}
