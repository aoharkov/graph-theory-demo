package org.example;

import org.example.algo.traversal.BreadthFirstSearch;
import org.example.algo.traversal.DepthFirstSearch;
import org.example.algo.traversal.GraphScan;
import org.example.model.Graph;
import org.example.util.EdgeListReader;
import org.example.util.FromInputToGraphReader;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.demo();
    }

    public void demo() {
        Graph graph = getDummyGraph();
        //Graph graph = getGraphFromConsole();
        GraphScan breadthFirstSearch = new BreadthFirstSearch(graph);
        breadthFirstSearch.traverse(1);
        GraphScan depthFirstSearch = new DepthFirstSearch(graph);
        depthFirstSearch.traverse(1);

    }

    private Graph getGraphFromConsole() {
        FromInputToGraphReader reader = new EdgeListReader(System.in);
        return reader.read();
    }

    private Graph getDummyGraph() {
        Graph graph = new Graph(12);
        graph.addTwoWayEdge(1, 2);
        graph.addTwoWayEdge(1, 3);
        graph.addTwoWayEdge(1, 4);
        graph.addTwoWayEdge(2, 5);
        graph.addTwoWayEdge(2, 6);
        graph.addTwoWayEdge(4, 7);
        graph.addTwoWayEdge(4, 8);
        graph.addTwoWayEdge(5, 9);
        graph.addTwoWayEdge(5, 10);
        graph.addTwoWayEdge(7, 11);
        graph.addTwoWayEdge(7, 12);
        return graph;
    }
}


