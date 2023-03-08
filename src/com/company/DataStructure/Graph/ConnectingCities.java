package com.company.DataStructure.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class ConnectingCities {
    public static void main(String[] args) {
        int cities[][] ={{0,1,2,3,4},{1,0,5,0,7},{2,5,0,6,0},{3,0,6,0,0},{4,7,0,0,0}};
        ArrayList<EdgeW>graph []= new ArrayList[cities.length];
        createGraph(cities,graph);
         int i = prims(graph);
        System.out.println(i);

    }


    private static int prims(ArrayList<EdgeW>[] graph) {
        int cost = 0;
        boolean[] visted = new boolean[graph.length];
        Arrays.fill(visted,false);
        PriorityQueue<Pair> q = new PriorityQueue<>();
        q.add(new Pair(0,0));
        while(!q.isEmpty()){
            Pair curr = q.poll();

            if(!visted[curr.n]){
                cost = cost + curr.path;
                visted[curr.n]= true;
                for (int i = 0; i <graph[curr.n].size(); i++) {
                    EdgeW e = graph[curr.n].get(i);
                    int v = e.dest;
                    int wt = e.wt;
                    q.add(new Pair(v,wt));
                }
            }
        }
        return cost;

    }

    private static void createGraph(int[][] cities,ArrayList<EdgeW>graph[]) {
        for (int i = 0; i <graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i <cities.length; i++) {
            for (int j = 0; j <cities[i].length; j++) {
                if(cities[i][j]!=0){
                    graph[i].add(new EdgeW(i,j,cities[i][j]));
                }
            }
        }
    }
}
