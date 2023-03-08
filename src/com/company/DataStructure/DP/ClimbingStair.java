package com.company.DataStructure.DP;

public class ClimbingStair {
    public static void main(String[] args) {
        int n = 5;
        int dp [] = new int[6];
        System.out.println(  ways(n,dp));
    }

    private static int ways(int n, int dp[]) {
        if(n ==0 ){
            return 1;
        }else if ( n <0){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n] = ways(n-2,dp)+ways(n-1,dp);
        return dp[n];
    }

}
