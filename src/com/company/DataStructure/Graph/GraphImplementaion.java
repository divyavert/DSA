package com.company.DataStructure.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphImplementaion {
    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> G = new ArrayList<>();
        for (int i = 0; i <v ; i++) {
           G.add(new ArrayList<Integer>());
        }
        addedge(G,0,1);
        addedge(G,0,3);

        addedge(G,1,2);
        addedge(G,3,2);
        int[] ans =shorte(G,5);
        for (int a : ans){
            System.out.println(a);
        }


//        for (int i = 0; i <v; i++) {
//            for (int a:G.get(i)) {
//                System.out.print(a+" ");
//            }
//            System.out.println();
//        }
//        G.get(2).remove(2);
//
//        for (int i = 0; i <v; i++) {
//            for (int a:G.get(i)) {
//                System.out.print(a+" ");
//            }
//            System.out.println();
//        }
    }

    static void addedge(ArrayList<ArrayList<Integer>>G,int u,int v){
        G.get(u).add(v);
        G.get(v).add(u);
    }
    static void bfs (ArrayList<ArrayList<Integer>>G,int n){
        Queue<Integer>q = new LinkedList<>();
        q.add(0);

        boolean [] arr = new boolean[n];
        for (boolean b:arr) {
            b = false;
        }
        arr[0]=true;

        while (!q.isEmpty()){
            int a = q.poll();
            System.out.println(a);

            for (int x:G.get(a)) {
                if(!arr[x]){
                    arr[a]= true;
                    q.add(x);
                }
            }
        }

    }
    static void dfs (ArrayList<ArrayList<Integer>>G,int n){
        Stack<Integer> s = new Stack<>();
        s.push(0);
        boolean [] arr = new boolean[n];
        for (boolean b:arr) {
            b = false;
        }
        arr[0]=true;

        while (!s.isEmpty()){
            int x = s.pop();
            System.out.println(x);
            for (int a :G.get(x)) {
                if(!arr[a]){
                    s.push(a);
                    arr[a]=true;
                }


            }
        }
    }
    static int [] shorte (ArrayList<ArrayList<Integer>>G,int n){
        Queue<Integer>q = new LinkedList<>();
        q.add(0);
        int [] dis = new int[n];
        boolean [] arr = new boolean[n];
        for (boolean b:arr) {
            b = false;
        }
        arr[0]=true;

        while (!q.isEmpty()){
            int a = q.poll();


            for (int x:G.get(a)) {
                if(!arr[x]){
                    dis[x]= dis[a]+1;
                    arr[x]= true;
                    q.add(x);
                }
            }
        }
        return dis;
    }

    }
