package org.example.algo.traversal;

import org.example.model.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch extends GraphScan {

    public BreadthFirstSearch(Graph graph) {
        super(graph);
    }

    @Override
    public void traverse(int startVertex) {
        System.out.println("Doing BreadthFirstSearch");
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();

            doTaskOnArrival(currentVertex);

            for (int neighbor : graph.getAdjacencyList().get(currentVertex)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                }
            }
        }
    }
}
