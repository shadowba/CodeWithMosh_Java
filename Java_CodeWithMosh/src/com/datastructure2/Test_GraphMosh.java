package com.datastructure2;

public class Test_GraphMosh {
    public static void main(String[] args) {
        GraphMosh graph=new GraphMosh();

        graph.addNode("A");
        graph.addNode("C");
        graph.addNode("B");

        graph.addEdge("A","B");
        graph.addEdge("A","C");
        graph.addEdge("B","A");
        graph.print();
    }

}
