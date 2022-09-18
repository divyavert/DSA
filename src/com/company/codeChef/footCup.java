package com.company.codeChef;

import java.util.Scanner;

public class footCup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x==y&&x!=0&&y!=0){
                System.out.println("yes");

            }else {
                System.out.println("no");
            }
        }
    }
}
