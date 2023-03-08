package com.company.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class q785t {
    public static void main(String[] args) {
        int graph[][] = new int[4][4];

        graph[0][2] = 1;
        graph[0][3] = 1;
        graph[1][0] = 1;
        graph[1][2] = 1;
        graph[2][0] = 1;
        graph[2][1] = 1;
        graph[2][3] = 1;
        graph[3][0] = 1;
        graph[3][2] = 1;

        System.out.println(isBiparite(graph));
    }

    private static boolean isBiparite(int[][] graph) {
        int col []= new int[graph.length];
        Arrays.fill(col,-1);
        Queue<Integer> q= new LinkedList<>();
        for (int i = 0; i <graph.length; i++) {
            if(col[i]==-1){
                q.add(i);
                col[i]= 0;
                while (!q.isEmpty()){
                    int j =  q.poll();
                    for (int k =0;k<graph[j].length;k++){
                        int curr = graph[j][k];
                            if(col[curr]==-1){
                                int next = col[j]==0?1:0;
                                col[curr]=next;
                                q.add(curr);
                            }else {
                                if (col[j] == col[curr]){
                                    return false;
                                }
                            }

                    }
                }
            }
        }
        return true;
    }
}
