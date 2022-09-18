package com.company.codeChef;

import java.util.Scanner;

public class CHAIRS_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int ans = x-y;
            if(ans < 0){
                ans = 0;
            }
            System.out.println(ans);
        }

    }
}
