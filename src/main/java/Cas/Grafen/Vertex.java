package Cas.Grafen;

import java.util.LinkedList;
import java.util.List;

public class Vertex {
    public String name;
    public List<Edge> adjecent;
    public Vertex  prev;
    public double dist;
    public int scratch;
    public Vertex (String nm){
        name = nm;
        adjecent = new LinkedList<Edge>();
        reset();
    }

    public void reset() {
        dist = Graph.INFINITY;
        prev = null;
        scratch = 0;
    }
}
