package com.company.graph;

public class Edge implements Comparable<Edge>{
int src,dest,wt;

    public Edge(int src, int dest, int wt) {
        this.src = src;
        this.dest = dest;
        this.wt = wt;
    }

    @Override
    public int compareTo(Edge that) {
        return this.wt-that.wt;
    }
}
