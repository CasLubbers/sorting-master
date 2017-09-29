package Cas.Grafen;

import java.util.HashMap;
import java.util.Map;

public class Graph {

    public static final double INFINITY = Double.MAX_VALUE;

    public void addEdges(String sourceName, String destName, double cost){
        Vertex v = getVertex(sourceName);
        Vertex w = getVertex(destName);
        v.adjecent.add(new Edge(w,cost));
    }

    private Vertex getVertex(String vertexName){
        Vertex v = vertexMap.get(vertexName);
        if(v == null){
            v = new Vertex(vertexName);
            vertexMap.put(vertexName, v);
        }
        return v;
    }

    private void clearAll(){
        for (Vertex v: vertexMap.values()             ) {
            v.reset();
        }
    }

    private Map<String, Vertex> vertexMap = new HashMap<String, Vertex>();
}
