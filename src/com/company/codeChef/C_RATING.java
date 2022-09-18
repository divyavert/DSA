package com.company.codeChef;

import java.util.Scanner;

public class C_RATING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int my = sc.nextInt();
            int reach = sc.nextInt();
            int diff = reach - my ;
            if (diff<= 8){
                System.out.println(1);
            }else{
                if (diff%8==0){
                    System.out.println(diff/8);
                }else{
                    int a = (diff/8) + 1;
                    System.out.println(a);
                }
            }
        }
    }
}
