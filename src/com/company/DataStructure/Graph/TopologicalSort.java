package com.company.DataStructure.Graph;


import java.util.ArrayList;
import java.util.Stack;

import com.company.DataStructure.Graph.Edge;
public class TopologicalSort {

    public static void main(String[] args) {
        ArrayList<Edge> graph []= new ArrayList[6];
        for (int i = 0; i < graph.length; i++) {
            graph[i]= new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));

        graph[2].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));

        graph[4].add(new Edge(4,1));


        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
        topologicalSort(graph);
    }

    private static void topologicalSort(ArrayList<Edge>[] graph) {
       boolean visted [] = new boolean[graph.length];
       Stack<Integer>st = new Stack<>();

       for (int i=0;i<visted.length;i++){
           if(!visted[i]){
               topologicalSortUtils(graph,visted,st,i);
           }
       }
       while (!st.isEmpty()){
           System.out.print(st.pop()+" ");
       }
    }

    private static void topologicalSortUtils(ArrayList<Edge>[] graph, boolean[] visted, Stack<Integer> st, int curr) {
        visted[curr]= true;
        for(int i = 0;i<graph[curr].size();i++){
            Edge e =graph[curr].get(i);
            if(!visted[e.dest]){
                topologicalSortUtils(graph,visted,st, e.dest);
            }

        }
        st.add(curr);
    }
}
