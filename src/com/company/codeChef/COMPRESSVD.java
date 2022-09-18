package com.company.codeChef;

import java.util.Scanner;

public class COMPRESSVD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int count = 0;

            int n = sc.nextInt();
            int[] arr= new int[n];
            if (n == 1){
                int a = sc.nextInt();
                System.out.println(1);

            }else{

                for (int i = 0; i <n ; i++) {
                 arr[i]= sc.nextInt();
                }
                for (int j = 0; j <arr.length-1 ; j++) {
                    if(arr[j]==arr[j+1]){
                        count ++;
                    }
                }
                System.out.println(n-count);

            }

        }
    }
}
