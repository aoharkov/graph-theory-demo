package org.example.algo.traversal;

import org.example.model.Graph;

public abstract class GraphScan {

    protected Graph graph;
    protected boolean[] visited;

    protected GraphScan(Graph graph) {
        this.graph = graph;
        this.visited = new boolean[graph.getNumVertices() + 1];
    }

    public abstract void traverse(int startVertex);

    public void doTaskOnArrival(int vertex) {
        visited[vertex] = true;
        System.out.println("Visited vertex: " + vertex);
    }

}
