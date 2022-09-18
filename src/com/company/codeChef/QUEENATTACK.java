package com.company.codeChef;

import java.util.Scanner;

public class QUEENATTACK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x==0||y==0||n==0)
                return;
            int rc = (2*n)-2;
           int d = diagonal(n,x,y);
           int total = rc +d;
            System.out.println(total);

        }


    }
    static int diagonal(int n,int x,int y){
        int dia;
        int mid;
        if(x==1||y==1||x==n||y==n){
            dia = n-1;
            return dia;
        }
        if(n%2==0) {
            mid = (n)/2;

            if (y<=mid){
                int d1 = n - 1;
                int d2 = (y - 1) * 2;
                dia = d1 + d2;
                return dia;
            }else {
                int z = n-y;
                int d1 = n - 1;
                int d2 = (z - 1) * 2;
                dia = d1 + d2;
                return dia;
            }

        }else{
             mid = (n+1)/2;
            if (y<=mid){

                int l = (mid - y)+1;
                dia = (2*n)-(2*l);
                return dia;
            }else {

                int l = n-y;
                dia = (2*n)-(2*l);
                return dia;
            }

            }
    }
}
