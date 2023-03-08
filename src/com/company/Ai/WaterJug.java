package com.company.Ai;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Pair {
    int jug1;
    int jug2;
    List<Pair> path = new ArrayList<>();
   public  Pair(int j1, int j2)
    {
        this.jug1 = j1;
        this.jug2 = j2;
        path = new ArrayList<>();
    }
    public Pair(int i, int j, List<Pair> _path) {
        this.jug1 = i;
        this.jug2 = j;


        path.addAll(_path);
        path.add(new Pair(i,j));
    }
}
public class WaterJug {
    public static void main(String[] args) {
        int jug1 = 4;
        int jug2 = 3;
        int target = 2;

        Solve(jug1,jug2,target);

    }

    private static void Solve(int jug1, int jug2, int target) {
        Pair intitalState = new Pair(0,0);
        intitalState.path.add(new Pair(0,0));
        boolean[][] visted = new boolean[jug1+1][jug2+1];

        Queue<Pair> q = new LinkedList<>();
        q.add(intitalState);
        while(!q.isEmpty()){
            Pair curr = q.poll();
            if(curr.jug1>jug1||curr.jug2>jug2||visted[curr.jug1][curr.jug2]){
                continue;
            }
            visted[curr.jug1][curr.jug2]= true;
            if (curr.jug1 == target || curr.jug2 == target) {
                if (curr.jug1 == target) {
                    curr.path.add(new Pair(curr.jug1,0));
                }else{
                    curr.path.add(new Pair(0,curr.jug2));
                }
                int n = curr.path.size();
                for (int i = 0; i <n; i++) {
                    System.out.println(curr.path.get(i).jug1+" , "+curr.path.get(i).jug2);
                }
                return;
            }

            q.add(new Pair(curr.jug1, 0 , curr.path));
            q.add(new Pair(0,curr.jug2,curr.path));

            q.add(new Pair(jug1,curr.jug2,curr.path));
            q.add(new Pair(curr.jug1, jug2,curr.path));

            q.add(new Pair(jug1,0,curr.path));
            q.add(new Pair(0, jug2,curr.path));

            int emptyJug2 = jug2- curr.jug2;
            int amount1 = Math.min(emptyJug2, curr.jug1);
            int j1 = curr.jug1 - amount1;
            int j2 = curr.jug2+amount1;
            q.add(new Pair(j1,j2,curr.path));

            int emptyJug1 = jug1- curr.jug1;
            int amount2 = Math.min(emptyJug1, curr.jug2);
             j1 = curr.jug1 + amount2;
             j2 = curr.jug2 - amount2;
            q.add(new Pair(j1,j2,curr.path));




        }
        System.out.println("Answer Not possible");

    }
}
