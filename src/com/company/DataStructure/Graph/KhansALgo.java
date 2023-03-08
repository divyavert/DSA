package com.company.DataStructure.Graph;
import com.company.DataStructure.Graph.Edge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KhansALgo {
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
        khan(graph);

    }

    private static void khan(ArrayList<Edge>[] graph) {
        int[] indegree = new int [graph.length];
        calIngdree(graph,indegree);
        Queue<Integer>q= new LinkedList<>();
        for (int i = 0; i <indegree.length; i++) {
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while (!q.isEmpty()){
            int k = q.poll();
            System.out.print(k);
            for (int i = 0; i <graph[k].size(); i++) {
                Edge curr = graph[k].get(i);
                indegree[curr.dest]--;
                if(indegree[curr.dest]==0){
                    q.add(curr.dest);
                }
            }
            System.out.println();
        }
    }

    private static void calIngdree(ArrayList<Edge>[] graph, int[] indegree) {
        for (int i = 0; i <indegree.length; i++) {
            for (int j = 0; j <graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                indegree[e.dest]++;
            }
        }
    }
}
