package com.company.DataStructure.DP;

public class StringConversion {
    public static void main(String[] args) {
        String word1 = "pear";
        String word2 = "sea";
        int a = sc(word1,word2);
        int del = word2.length()-a;
        int upd = word1.length()-a;
        System.out.println(del+upd);
    }

    private static int sc(String word1, String word2) {
        int [][]dp = new int[word1.length()+1][word2.length()+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <dp[0].length; j++) {
                if(i==0||j==0){
                    dp[i][j]=0;
                }

            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j <dp[0].length; j++) {
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]= dp[i-1][j-1]+1;
                }else {
                    int a = dp[i-1][j];
                    int b = dp[i][j-1];
                    dp[i][j]= Math.max(a,b);
                }
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }

}
