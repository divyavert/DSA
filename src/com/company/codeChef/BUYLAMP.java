package com.company.codeChef;

import java.util.Scanner;

public class BUYLAMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int ans =0;
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y<x){
                ans = (x*k)+(y*(n-k));
            }else {
                ans = n*x;
            }

            System.out.println(ans);
        }
    }
}
