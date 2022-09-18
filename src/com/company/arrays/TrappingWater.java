package com.company.arrays;

import java.util.Arrays;

public class TrappingWater {
    public static void main(String[] args) {
        int [] a = {4,2,0,3,2,5};

        System.out.println(trapped(a));
    }

     static int trapped(int[] a) {
        int right [] = new int [a.length];
        int left [] = new int[a.length];
        int sum =0;
        right[0] = a[0];
        for (int i = 1; i <a.length; i++) {
            right[i]=Math.max(a[i],right[i-1]);
        }
        left[a.length-1]=a[a.length-1];
        for (int i = a.length-2; i >=0; i--) {
            left[i]=Math.max(a[i],left[i+1]);
        }

        for (int i = 0; i <a.length ; i++) {
            int wl = Math.min(left[i],right[i]);
            sum += wl-a[i];
        }

        return sum;
    }

}

