package com.company.codeChef;

import java.util.Scanner;

public class EXPIRY {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int total = m*k;
            if(total >= n){
                System.out.println("YES");

            }else {
                System.out.println("NO");
            }
        }
    }
}
