package com.company.codeChef;

import java.util.Scanner;

public class GRIDBL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int ans = 0;
            int n = sc.nextInt();
            int m = sc.nextInt();
            if((n&1)==1||(m&1)==1){
                if((n&1)==1 && (m&1)==1){
                    ans = n+m-1;
            } else{
                  if((n&1)==1){
                      ans = m;
                  }else {
                      ans = n;
                  }
                }
            }

            System.out.println(ans);
        }
    }
}
