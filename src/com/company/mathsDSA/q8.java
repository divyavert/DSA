package com.company.mathsDSA;

import java.util.Arrays;

public class q8 {
    public static void main(String[] args) {
        int arr [] = {3,1,11,1,3,1,3,5,5,5};
        repeat(arr);
    }
    static void repeat(int arr[]) {
        double ans = 0;
        int binarry[] = {0, 0, 0, 0, 0};

        for (int n : arr) {
            for (int i = 0; i < binarry.length; i++) {
                binarry[i] = binarry[i] + n % 2;
                n = n / 2;
            }

        }
        for (int i = 0; i <binarry.length; i++) {
            binarry[i] = binarry[i]%3;
        }
        for (int i = 0; i <binarry.length; i++) {
            ans = ans + binarry[i]*Math.pow(2,i);
        }

        System.out.println(ans);
    }
}
