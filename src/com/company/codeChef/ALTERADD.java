package com.company.codeChef;

import java.util.Scanner;

public class ALTERADD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = b-a;
            int d = 4;
            int ans = 0;

            if(c%3==0||c==1){
                System.out.println("YES");
            }else if ((c-4)%3==0){

                   System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}

