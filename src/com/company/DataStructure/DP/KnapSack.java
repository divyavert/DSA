package com.company.DataStructure.DP;

import java.util.Arrays;

public class KnapSack {
    public static void main(String[] args) {
        int v[] = {1,6,7,5};
        int wt[] = {1,6,7,5};
        int w = 10;
        int i =v.length;
        int val = 0;
        int dp[][]= new int [v.length+1][w+1];
        for (int j = 0; j <v.length+1; j++) {
            for (int k = 0; k <w+1; k++) {
                dp[j][k]=-1;
            }
        }
        tabulation(v,wt,w,i,val);
        MYrecurssion(v,wt,w,i,val);
        System.out.println(DIrecurssion(v,wt,w,i));
        int ams = DIDP(v,wt,w,i,dp);
        System.out.println(ams);
        System.out.println(max);
    }

    private static void tabulation(int[] v, int[] wt, int w, int i, int val) {
        int dp[][]=new int[v.length+1][w+1];
        for (int j = 0; j <v.length+1; j++) {
            dp[j][0]=0;
        }
        for (int j = 0; j <w+1; j++) {
            dp[0][j]=0;
        }
        for (int j = 1; j <v.length+1; j++) {
            for (int k = 1; k <w+1 ;k++) {
                int value = v[j-1];
                int wi = wt[j-1];
                if(wi<=k){
                   int ans =  value + dp[j-1][k-wi];
                   int an = dp[j-1][k];
                   int max = Math.max(ans,an);
                   dp[j][k]= max;
                }else {
                    dp[j][k]=dp[j-1][k];
                }

            }
        }

        for (int j = 0; j <v.length+1 ; j++) {
            for (int k = 0; k <w+1; k++) {
                System.out.print(dp[j][k]+" ");
            }
            System.out.println();
        }
    }

    private static int DIrecurssion(int[] v, int[] wt, int w, int i) {
        if(w==0||i==0){
            return 0;
        }
        if(wt[i-1]<=w){
            int ans1 = v[i-1] + DIrecurssion(v,wt,w-wt[i-1],i-1);
            int ans2 = DIrecurssion(v,wt,w,i-1);
            return Math.max(ans1,ans2);
        }else {
            return DIrecurssion(v,wt,w,i-1);
        }
    }
    private static int DIDP(int[] v, int[] wt, int w, int i, int[][] dp) {
        if(w==0||i==0){
            return 0;
        }
        if(dp[i][w]!=-1){
            return dp[i][w];
        }

        if(wt[i-1]<=w){
            int ans1 = v[i-1] + DIDP(v,wt,w-wt[i-1],i-1,dp);
            int ans2 = DIDP(v,wt,w,i-1,dp);
            dp[i][w] = Math.max(ans1,ans2);
            return dp[i][w];
        }else {
            dp[i][w] = DIDP(v,wt,w,i-1,dp);
            return dp[i][w];
        }
    }

    static  int max = Integer.MIN_VALUE;
    // cannot use dp here because void return type you should return something to store it
    private static void  MYrecurssion(int[] v, int[] wt, int w, int i, int val) {
        if(w<0||i==0){
            return;
        }
       max = Math.max(val,max);
       MYrecurssion(v,wt,w-wt[i-1],i-1,val+v[i-1]);
       MYrecurssion(v,wt,w,i-1,val);
    }


}
