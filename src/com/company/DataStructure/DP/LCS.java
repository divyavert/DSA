package com.company.DataStructure.DP;

public class LCS {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "acde";
        int dp[][] = new int[s1.length()][s2.length()];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = lcsR(s1,s2);
        int ans2 = lcsM(s1,s2,dp);
        int ans3 = lcsT(s1,s2);
        System.out.println(ans3);
    }

    private static int lcsT(String s1, String s2) {
        int dp [][] = new int[s1.length()+1][s2.length()+1];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j <s2.length(); j++) {
                if(i==0||j==0){
                    dp[i][j]=0;
                }

            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j <dp[0].length; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]= dp[i-1][j-1]+1;
                }else {
                    int ans0 = dp[i-1][j];
                    int ans1  = dp[i][j-1];
                    dp[i][j] = Math.max(ans1,ans0);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

    // memoiztaion
    private static int lcsM(String s1, String s2,int [][]dp) {
        if(s1.length()==0||s2.length()==0){
            return 0;
        }
        if(dp[s1.length()-1][s2.length()-1]!= -1){
            return dp[s1.length()-1][s2.length()-1];
        }
        char a = s1.charAt(0);
        char b = s2.charAt(0);
        if(a == b){
            dp[s1.length()-1][s2.length()-1] = 1 + lcsM(s1.substring(1),s2.substring(1),dp);
            return dp[s1.length()-1][s2.length()-1];
        }else {
            int i = lcsM(s1.substring(1),s2,dp);
            int j = lcsM(s1,s2.substring(1),dp);
            dp[s1.length()-1][s2.length()-1]= Math.max(i,j);
            return dp[s1.length()-1][s2.length()-1];
        }
    }
// recursion
    private static int lcsR(String s1, String s2) {

        if(s1.length()==0||s2.length()==0){
            return 0;
        }
        char a = s1.charAt(0);
        char b = s2.charAt(0);
        if(a == b){
            return 1 + lcsR(s1.substring(1),s2.substring(1));
        }else {
            int i = lcsR(s1.substring(1),s2);
            int j = lcsR(s1,s2.substring(1));
            return Math.max(i,j);
        }
    }
// tabulation

}
