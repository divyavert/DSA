package com.company.codeChef;

import java.util.Scanner;

public class NEARESTCOURT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int mid = (x+y)/2;
            int min = Math.max(Math.abs(x-mid),Math.abs(y-mid));
            System.out.println(min);
        }

    }
}
