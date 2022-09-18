package com.company.codeChef;

import java.util.Scanner;

public class F1RULE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double max = (x * 1.07);
            if(y>max){
                System.out.println("no");
            }else {
                System.out.println("yes");
            }
        }
    }
}
