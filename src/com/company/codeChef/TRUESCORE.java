package com.company.codeChef;

import java.util.Scanner;

public class TRUESCORE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if(c<a){
                System.out.println("IMPOSSIBLE");
            }else if(d<b){
                System.out.println("IMPOSSIBLE");
            }else {
                System.out.println("POSSIBLE");
            }
        }
    }
}
