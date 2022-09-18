package com.company.codeChef;

import java.util.Scanner;

public class FILLCANDIES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();
            int l = k*m;
            int ans = 0;
            if(n%l==0){
                ans = n/l;

            }else {
                ans = (n/l)+1;
            }
            System.out.println(ans);
        }
    }
}
