package org.example.util;

import org.example.model.Graph;

import java.io.InputStream;
import java.util.Scanner;

public abstract class FromInputToGraphReader {

    protected Scanner input;
    protected int numVertices;

    protected FromInputToGraphReader(InputStream inputStream) {
        this.input = new Scanner(inputStream);
    }

    public Graph read() {
        numVertices = input.nextInt();
        Graph graph = new Graph(numVertices);
        readEdges(graph);
        return graph;
    }

    protected abstract void readEdges(Graph graph);
}
