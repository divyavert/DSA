package com.company.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class q210 {
    public static void main(String[] args) {
        int  numCourses = 4;
        int [][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};

        if(cycleDetection(prerequisites, numCourses)){
            System.out.println("cycle");
        }else {
            topological(numCourses,prerequisites);
        }

    }

    private static boolean cycleDetection(int[][] prerequisites, int numCourses) {
        boolean visted []= new boolean[numCourses];
        boolean[]st = new boolean [numCourses];
        for (int i = 0; i <visted.length; i++) {
            if(!visted[i]){
                if(cycleDetectionUtils(prerequisites,numCourses,i , visted,st)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean cycleDetectionUtils(int[][] prerequisites, int numCourses, int i, boolean[] visted,boolean []st) {

        st[i]= true;
        visted[i]=true;

        for (int j = 0; j <prerequisites.length; j++) {
            if(prerequisites[j][1]==i){
                int curr = prerequisites[j][0];
                if(visted[curr] &&st[curr]){
                    return true;
                }else if(!visted[curr]){
                   if( cycleDetectionUtils(prerequisites,numCourses,curr,visted,st)){
                       return true;
                   }
                }
            }
        }
        st[i]= false;
        return false;
    }


    private static void topological(int numCourses, int[][] prerequisites) {
        int indegree []= new int [numCourses];
        clIndegree(prerequisites,indegree,numCourses);
        Queue<Integer>q= new LinkedList<>();
        int[] ans = new int [numCourses];
        int count = 0;
        for (int i = 0; i <indegree.length; i++) {
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while (!q.isEmpty()){
            int in = q.poll();
            ans[count]=in;
            count++;
            for (int i = 0; i <prerequisites.length; i++) {
                if(prerequisites[i][1]==in){
                    indegree[prerequisites[i][0]]--;
                    if(indegree[prerequisites[i][0]]==0){
                        q.add(prerequisites[i][0]);
                    }
                }
            }
        }

        for (int i :ans) {
            System.out.println(i);
        }
    }

    private static void clIndegree(int[][] prerequisites, int[] indegree,int numCourses ) {
        for (int i = 0; i <prerequisites.length; i++) {
            indegree[prerequisites[i][0]]++;
        }
    }
}
