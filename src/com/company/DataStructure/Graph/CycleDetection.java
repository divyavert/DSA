package com.company.DataStructure.Graph;

import java.util.ArrayList;

class Edge{
    int src;
    int dest;

    public Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}
public class CycleDetection {
    public static void main(String[] args) {
        ArrayList<Edge>graph []= new ArrayList[4];
        for (int i = 0; i < graph.length; i++) {
            graph[i]= new ArrayList<>();
        }

        graph[0].add(new Edge(0,3));

        graph[0].add(new Edge(0,1));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,3));


        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,0));

        boolean t = cycleDetection(graph);
        System.out.println(t);



    }

    private static boolean cycleDetection(ArrayList<Edge>[] graph) {
       boolean[] visted = new boolean [4];
        for (int i = 0; i <graph.length; i++) {
            if(!visted[i]){
                if(cycleDetectionUtils(graph,i,-1,visted)){
                    return true;
                }

            }
        }
        return false;
    }

    private static boolean cycleDetectionUtils(ArrayList<Edge>[] graph, int curr, int par, boolean[] visted) {
        visted[curr]= true;
        ArrayList<Edge> c = graph[curr];

        for (int i = 0; i <c.size(); i++) {
            if(visted[c.get(i).dest] && par != c.get(i).dest){
                return true;
            }else if(!visted[c.get(i).dest]){
                if(cycleDetectionUtils(graph,c.get(i).dest,c.get(i).src,visted)){
                    return true;
                }

            }
        }
        return false;
    }
}
