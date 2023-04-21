package org.example.util;

import org.example.model.Graph;

import java.io.InputStream;

public class EdgeListReader extends FromInputToGraphReader {

    public EdgeListReader(InputStream input) {
        super(input);
    }

    @Override
    protected void readEdges(Graph graph) {
        int numEdges = input.nextInt();
        for (int i = 0; i < numEdges; i++) {
            int from = input.nextInt();
            int to = input.nextInt();
            graph.addTwoWayEdge(from, to);
        }
    }
}
