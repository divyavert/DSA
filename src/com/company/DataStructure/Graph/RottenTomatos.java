//package com.company.DataStructure.Graph;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class RottenTomatos {
//    public static void main(String[] args) {
//    int[][] grid ={
//            {1,2,1},
//            {1,1,0},
//            {0,1,1}
//    };
//    rt(grid);
//    }
//    static void rt(int[][] grid){
//        int n = grid.length;
//        int m = grid[0].length;
//
//        Queue<pair> q = new LinkedList<>();
//        int cf =0;
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j<m;j++){
//                if(grid[i][j]==2){
//                    q.add(new pair(i,j,0));
//
//                }
//
//                if (grid[i][j]==1){
//                    cf++;
//                }
//
//            }
//        }
//        int ti =0;
//        while (!q.isEmpty()){
//            pair p = q.poll();
//            int r = p.row;
//            int c = p.col;
//            int t = p.tm;
//            ti = t;
//            if(r-1<n&&r-1>0&&grid[r-1][c]==1){
//                q.add(new pair(r-1,c,t+1));
//                grid[r-1][c]=2;
//            }
//            if(r+1<n&&r+1>0&&grid[r+1][c]==1){
//                q.add(new pair(r+1,c,t+1));
//                grid[r+1][c]=2;
//            }
//            if(c-1<m&&c-1>0&&grid[r][c-1]==1){
//                q.add(new pair(r,c-1,t+1));
//                grid[r][c-1]=2;
//            }
//            if(c+1<m&&c+1>0&&grid[r][c+1]==1){
//                q.add(new pair(r,c+1,t+1));
//                grid[r][c+1]=2;
//            }
//
//        }
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j < ; j++) {
//                if(grid)
//            }
//        }
//
//        System.out.println(ti);
//
//    }
//}
//class pair {
//    int row;
//    int col;
//    int tm;
//
//    public pair(int row, int col, int tm) {
//        this.row = row;
//        this.col = col;
//        this.tm = tm;
//    }
//}