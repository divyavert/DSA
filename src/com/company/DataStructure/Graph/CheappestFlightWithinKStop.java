package com.company.DataStructure.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class info{
    int v;
    int cost;
    int stop;
    public info(int v,int cost,int stop){
        this.cost=cost;
        this.stop=stop;
        this.v=v;
    }
}
public class CheappestFlightWithinKStop {
    public static void main(String[] args) {
    int flight[][] ={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
    int src = 0;
    int dest = 3;
    int n = 4;
    int k = 1;
    int[] dist = new int[4];
    dijkstra(0,3,k,flight,n,dist);
        System.out.println( dist[dest]);

    }

    private static void dijkstra(int src , int dest,int k,int flight[][],int n,int[]dist) {

        ArrayList<EdgeW>[] graph = new ArrayList[n];
        createGraph(graph,flight);
        boolean[] visted = new boolean[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != src)
                dist[i] = Integer.MAX_VALUE;
        }
        Queue<info> q = new LinkedList<>();
        q.add(new info(src, 0,0));
        while (!q.isEmpty()) {
            info curr = q.poll();
            if(curr.stop>k){
                break;
            }
            for (int i = 0; i < graph[curr.v].size(); i++) {
                    EdgeW pre = graph[curr.v].get(i);
                    int u = pre.src;
                    int v = pre.dest;
                    int wt = pre.wt;
                    if (curr.cost + wt < dist[v] && curr.stop<=k ) {
                        dist[v] = dist[u] + wt;
                        q.add(new info(v, dist[v],curr.stop+1));
                    }

            }


        }

    }

    private static void createGraph(ArrayList<EdgeW>[] graph, int[][] flight) {
        for (int i = 0; i <graph.length; i++) {
            graph[i]= new ArrayList<>();
        }
        for (int i = 0; i <flight.length; i++) {

               int src = flight[i][0];
               int dest = flight[i][1];
               int wt = flight[i][2];
               EdgeW e = new EdgeW(src,dest,wt);
               graph[src].add(e);
        }
    }
}
