package com.company.leetcode;

import java.util.LinkedList;
import java.util.Queue;

class pair{
    int r;
    int c;

    public pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}

public class q733 {
    public static void main(String[] args) {
        int[][] image  = {{0,0,0},{0,0,0},{0,0,0}};
        int sr = 0;
        int sc = 0;
        int color = 0;
        int og = image[sr][sc];
        boolean[][]  visted = new boolean[image.length][image[1].length];
         helper(image,sr,sc,color,visted,og);
        for (int a[] :image) {
            for (int i :a) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    private static void helper(int[][] image, int sr, int sc, int color, boolean[][] visted, int og) {


        Queue<pair>q = new LinkedList<>();
        q.add(new pair(sr,sc));
        while (!q.isEmpty()){

            pair curr = q.poll();
            if(!visted[curr.r][curr.c]){
                visted[curr.r][curr.c]= true;
                image[curr.r][curr.c] = color;
                if (curr.r - 1 >= 0 && image[curr.r - 1][curr.c] == og) {
                    q.add(new pair(curr.r - 1, curr.c));
                }
                if (curr.r + 1 < image.length && image[curr.r + 1][curr.c] == og) {
                    q.add(new pair(curr.r + 1, curr.c));
                }
                if (curr.c + 1 < image[0].length && image[curr.r][curr.c + 1] == og) {
                    q.add(new pair(curr.r, curr.c + 1));
                }
                if (curr.c - 1 >= 0 && image[curr.r][curr.c - 1] == og) {
                    q.add(new pair(curr.r, curr.c - 1));
                }
            }
        }
    }
}
