package org.example.util;

import org.example.model.Graph;

import java.io.InputStream;

public class AdjacencyMatrixReader extends FromInputToGraphReader {

    public AdjacencyMatrixReader(InputStream input) {
        super(input);
    }

    @Override
    protected void readEdges(Graph graph) {
        for (int i = 1; i <= numVertices; i++) {
            for (int j = 1; j <= numVertices; j++) {
                if (input.nextInt() > 0) {
                    graph.addTwoWayEdge(i, j);
                }
            }
        }
    }
}
