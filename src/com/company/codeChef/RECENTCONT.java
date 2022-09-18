package com.company.codeChef;

import java.util.Scanner;

public class RECENTCONT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int a1 = 0;
            int a2 = 0;
            for (int i = 0; i < n; i++) {

                String s = sc.next();
                if(s.equals("START38") ){
                    a1++;
                }else {
                    a2++;
                }
            }
            System.out.printf("%d %d",a1,a2);
            System.out.println();
        }
    }
}
