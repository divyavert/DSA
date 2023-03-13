package com.company.DataStructure.DP;

import java.util.TreeSet;

public class LongestCommonIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {50,3,10,7,40,80};
        int a = lcs(arr);
        System.out.println(a);
    }

    private static int lcs(int[] arr) {
        TreeSet<Integer>set= new TreeSet<>();
        for (int i = 0; i <arr.length; i++) {
            set.add(arr[i]);
        }
        int arr2 [] = new int[set.size()];
        int k = 0;
        for (int i:set) {
            arr2[k] =i;
            k++;
        }

        return lscHelper(arr,arr2);

    }

    private static int lscHelper(int[] arr, int[] arr2) {
        int dp [][] =new int[arr.length+1][arr2.length+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <dp[i].length; j++) {
                if(i==0||j==0){
                    dp[i][j]=0;
                }
            }
        }
        for (int i = 1; i< dp.length;i++){
            for (int j = 1; j <dp[i].length; j++) {
                if(arr[i-1]==arr2[j-1]){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else {
                    int k = dp[i-1][j];
                    int l = dp[i][j-1];
                    dp[i][j] = Math.max(k,l);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
