package com.company.codeChef;

import java.util.Scanner;

public class AORB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int a1 = (500-(2*a)) +(1000-(4*(a+b)));
            int a2 = (500-(2*(a+b))) +(1000-(4*b));
            int max = Math.max(a1,a2);
            System.out.println(max);
        }
    }
}
