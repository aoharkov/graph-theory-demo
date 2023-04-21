package org.example.algo.traversal;

import org.example.model.Graph;

public class DepthFirstSearch extends GraphScan {

    public DepthFirstSearch(Graph graph) {
        super(graph);
    }

    @Override
    public void traverse(int startVertex) {
        System.out.println("Doing DepthFirstSearch");
        dfs(startVertex);
    }

    public void dfs(int startVertex) {
        doTaskOnArrival(startVertex);

        for (int vertex : graph.getAdjacencyList().get(startVertex)) {
            if (!visited[vertex]) {
                dfs(vertex);
            }
        }
    }
}
