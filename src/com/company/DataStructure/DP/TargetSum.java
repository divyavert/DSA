package com.company.DataStructure.DP;

import java.util.ArrayList;

public class TargetSum {
    public static void main(String[] args) {
        int[] number = {1,3,6,7,3,5};
        int tag = 10;
        ArrayList<ArrayList<Integer>>list  = new ArrayList<>();
        ArrayList<Integer> currList = new ArrayList<>();
        int[][] dp = new int[number.length][tag];
        for (int i = 0; i <number.length; i++) {
            for (int j = 0; j <tag ; j++) {
                dp[i][j]=-1;
            }
        }
        boolean [][] bp = new boolean[number.length+1][tag+1];


        findSubset(number,tag,list,currList,0,0);
        boolean ans = istarget(number,tag,0,0);
        boolean ans1 = istargetDP(number,tag,0,0,dp);
        boolean ans2 = istargetTAB(number,tag,0,0,bp);
        System.out.println(ans+" "+ans1);
        System.out.println(list);
    }

    private static boolean istargetTAB(int[] number, int tag, int i, int i1, boolean[][] bp) {
        for (int j = 0; j < bp.length; j++) {
            bp[j][0] = true;
        }
        for (int j = 1; j <bp.length ; j++) {
            for (int k = 1; k <bp[1].length; k++) {
                int val = number[j-1];
                if(val<=k && bp[j-1][k-val]){
                    bp[j][k]=true;
                }else {
                    bp[j][k] = bp[j-1][k];
                }
            }
        }
        for (boolean[] a:bp) {
            for (boolean an: a) {
                System.out.print(an+" ");

            }
            System.out.println();
        }
        return bp[bp.length-1][bp[0].length-1];
    }


    private static boolean istargetDP(int[] number, int tag, int sum, int i, int[][] dp) {
        if(sum == tag){
            return true;
        }
        if(i==number.length||sum>tag){
            return false;
        }
        if(dp[i][sum]!=-1){
            return dp[i][sum] == 1;
        }
        boolean ans1 = istarget(number,tag,sum+number[i],i+1);

        boolean ans2 = istarget(number,tag,sum,i+1);
        if(ans1||ans2){
            dp[i][sum] = 1;
            return true;
        }else {
            dp[i][sum] = 0;
            return false;
        }

    }

    private static boolean istarget(int[] number, int tag, int sum, int i) {
        if(sum == tag){
            return true;
        }
        if(i==number.length||sum>tag){
            return false;
        }
        boolean ans1 = istarget(number,tag,sum+number[i],i+1);
        boolean ans2 = istarget(number,tag,sum,i+1);
        if(ans1||ans2){
            return true;
        }else {
            return false;
        }
    }

    private static void findSubset(int[] number, int tag, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> currList,int i,int sum) {
        if(sum == tag){
            list.add(currList);
            return;
        }

        if(i==number.length || sum>tag){
            return;
        }
        ArrayList<Integer> copy = new ArrayList<>(currList);
        currList.add(number[i]);
        findSubset(number,tag,list,currList,i+1,sum+number[i]);
        currList = copy;
        findSubset(number,tag,list,currList,i+1,sum);

    }


}
