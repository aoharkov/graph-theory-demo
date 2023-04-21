package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    int numVertices;
    List<List<Integer>> adjacencyList;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new ArrayList<>(numVertices);
        for (int i = 0; i <= numVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addTwoWayEdge(int from, int to) {
        adjacencyList.get(from).add(to);
        adjacencyList.get(to).add(from);
    }

    public int getNumVertices() {
        return numVertices;
    }

    public List<List<Integer>> getAdjacencyList() {
        return adjacencyList;
    }
}
