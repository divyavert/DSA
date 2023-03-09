package com.company.DataStructure.DP;

import java.util.ArrayList;
import java.util.List;

public class CoinChnage {
    public static void main(String[] args) {
        int number [] = {2,5,3,6};
        int sum = 10;
        coinChange(number,sum);

    }

    private static void coinChange(int[] number, int sum) {
        int dp[][] = new int [number.length+1][sum+1];
        for (int i = 0; i <dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            dp[0][i]=0;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j <dp[0].length; j++) {
                if(number[i-1]<= j){
                    dp[i][j] = dp[i][j-number[i-1]]+dp[i-1][j];

                }else {
                    dp[i][j]= dp[i-1][j];
                }

            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <dp[0].length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
