package com.company.codeChef;

import java.sql.Array;
import java.util.Scanner;

public class DIVBYI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            int [] brr = new int[n];

            for (int i = 0; i <n; i++) {
                arr[i] = i+1;
            }
            for (int j = 0; j < n; j++) {
                if (n-2*j-1<n && n-2*j-1>=0){
                    brr[n-2*j-1] = arr[n-j-1];
                }

                if(n-2*j-2<n && n-2*j-2>=0 ){

                    brr[n-2*j-2] = arr[j];
                }

            }
            for (int k = 0; k < n; k++) {
                System.out.printf("%d ",brr[k]);

            }
            System.out.println();
        }
    }
}
