package com.company.leetcode;

public class q72 {
    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";
        int a = editDistance(word1,word2);
        System.out.println(a);
    }

    private static int editDistance(String word1, String word2) {
        int dp [][]= new int[word1.length()+1][word2.length()+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <dp[0].length ; i++) {
            dp[0][i]= i;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j <dp[0].length; j++) {
            if(word1.charAt(i-1)==word2.charAt(j-1)){
                dp[i][j] = dp[i-1][j-1];
            }else {
                int a = dp[i-1][j]+1;
                int b = dp[i][j-1]+1;
                int c = dp[i-1][j-1]+1;
                dp[i][j]= Math.min(a,Math.min(c,b));
            }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
