package com.company.codeChef;

import java.util.Scanner;

public class PERMGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int b = sc.nextInt();
            int a = sc.nextInt();
            if(b<a){
                System.out.println(-1);
            }else {
                System.out.print(a-b+1+" ");
                for (int i = 1; i <b; i++) {
                    if(i == (a-b+1)){
                        continue;
                    }
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }
}
