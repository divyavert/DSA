package com.company.codeChef;

import java.util.*;
import java.util.Scanner;

public class EQUALSTRING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            Set<Character> hash_Set = new HashSet<Character>();
            int n = sc.nextInt();
            sc.nextLine();
            String a = sc.nextLine();
            String b = sc.nextLine();
            for (int i = 0; i < n; i++) {
                if (a.charAt(i)!= b.charAt(i)){
                    hash_Set.add(b.charAt(i));
                }
            }

            System.out.println(hash_Set.size());
        }
    }
}
