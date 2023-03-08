package com.company.DataStructure.Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

import com.company.DataStructure.Graph.EdgeW;

class EdgeW{
    int src;
    int dest;
    int wt;

    public EdgeW(int src, int dest,int wt) {
        this.src = src;
        this.dest = dest;
        this.wt= wt;
    }
}
class Pair implements Comparable<Pair>{
    int n;
    int path;

    public Pair(int n, int path) {
        this.n = n;
        this.path = path;
    }

    @Override
    public int compareTo(Pair p2) {
        return this.path - p2.path;
    }
}

public class Dijkstra {
    public static void main(String[] args) {
        ArrayList<EdgeW> graph []= new ArrayList[6];

        for (int i = 0; i < graph.length; i++) {
            graph[i]= new ArrayList<>();
        }
        graph[0].add(new EdgeW(0,1,2));
        graph[0].add(new EdgeW(0,2,4));
        graph[1].add(new EdgeW(1,3,7));
        graph[1].add(new EdgeW(1,2,1));
        graph[2].add(new EdgeW(2,4,3));
        graph[3].add(new EdgeW(3,5,1));
        graph[4].add(new EdgeW(4,3,2));
        graph[4].add(new EdgeW(4,5,5));
        int src = 0;
        dijkstra(graph,src);

    }

    private static void dijkstra(ArrayList<EdgeW>[] graph, int src) {
        int[] dist = new int [graph.length];
        boolean[] visted = new boolean [graph.length];

        for (int i = 0; i <dist.length; i++) {
            if(i!=src)
                dist[i]= Integer.MAX_VALUE;
        }
        PriorityQueue<Pair> q = new PriorityQueue<>();
        q.add(new Pair(src,0));
        while (!q.isEmpty()){
            Pair curr = q.poll();
            if(!visted[curr.n]){
                visted[curr.n]= true;

                for (int i = 0; i <graph[curr.n].size(); i++) {
                    EdgeW pre = graph[curr.n].get(i);
                    int u = pre.src;
                    int v = pre.dest;
                    int wt = pre.wt;
                    if(dist[u]+wt < dist[v] ){
                        dist[v]= dist[u]+wt;
                        q.add(new Pair(v,dist[v]));
                    }

                }
            }

        }

        for (int j : dist) {
            System.out.println(j);
        }
    }

}
