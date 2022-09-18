package com.company.codeChef;

import java.util.Scanner;

public class SUBSCRIBE_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int no = n/6 ;
            int ro = n%6;
            if(ro!=0){
                no++;
            }
            System.out.println(no*x);
        }
    }
}
