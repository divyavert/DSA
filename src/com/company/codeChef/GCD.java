package com.company.codeChef;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Set<Integer> hash_Set = new HashSet<Integer>();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = Math.max(a,b);

            for (int i = 1; i <=a; i++) {
                int gcd = 0;
                for(int j = 1; j <= a && j <= b; j++)
                {

                    if((a+i)%j==0 && (b+i)%j==0){
                        gcd = j;
                    }


                }
                hash_Set.add(gcd);
            }

            System.out.println(hash_Set.size());
        }
    }
}
