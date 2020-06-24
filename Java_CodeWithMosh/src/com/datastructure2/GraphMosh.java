package com.datastructure2;

import java.util.*;

public class GraphMosh {
    private class Node {
        private String label;

        public Node(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Node>> adjacencyList = new HashMap<>();

    public void addNode(String label) {
        var node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to) {
        var fromNode = nodes.get(from);
        if (fromNode == null)
            throw new IllegalArgumentException();

        var toNode = nodes.get(to);
        if (toNode == null)
            throw new IllegalArgumentException();

        adjacencyList.get(fromNode).add(toNode);
    }

    public void print() {
        for (var source : adjacencyList.keySet()) {
            var targets = adjacencyList.get(source);
            if (!targets.isEmpty())
                System.out.println(source + " is connected to " + targets);
        }
    }

    public void removeNode(String label) {
        var node = nodes.get(label);
        if (node == null)
            return;

        for (var n : adjacencyList.keySet())
            adjacencyList.get(n).remove(node);

        adjacencyList.remove(node);
        nodes.remove(node);
    }

    public void removeEdge(String from, String to) {
        var fromNode = nodes.get(from);
        var toNode = nodes.get(to);

        if (fromNode == null || toNode == null)
            return;

        adjacencyList.get(fromNode).remove(toNode);
    }

    public List<String> topologicalSort() {
        Stack<Node> stack = new Stack<>();
        Set<Node> visited = new HashSet<>();
        List<String> resultList = new ArrayList<>();

        for (Node node : nodes.values())
            topologicalSort(node, stack, visited);

        while (!stack.empty())
            resultList.add(stack.pop().label);
        return resultList;
    }

    private void topologicalSort(Node node, Stack<Node> stack, Set<Node> visited) {
        if(visited.contains(node))
            return;
        visited.add(node);

        for (Node child : adjacencyList.get(node))
            topologicalSort(child, stack, visited);

        stack.push(node);
    }

}
