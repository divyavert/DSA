package com.company.sheetQuestions;

import java.sql.Array;
import java.util.Arrays;

public class medianOfTwoSortedArraysOfDifferentSizes {
    public static void main(String[] args) {
        int k = 0;
        int j = 0;
        int i = 0;
        int arr1 [] = {-5,3,6,12,15};
        int arr2 [] = {-12,-10,-6,-3,4,10};
        int arr [] = new int[arr2.length+arr1.length];
        int l = Math.min(arr1.length,arr2.length);

        while (i<=l && j<=l){

                if(arr1[i]<=arr2[j]){
                arr[k] = arr1[i];
                i++;
                k++;
                }else {
                    arr[k]= arr2[j];
                    j++;
                    k++;
                }

        }
        while(i<arr1.length){
            arr[k] = arr1[i];
                    i++;
            k++;
        }
        while (j<arr2.length){
            arr[k]= arr2[j];
            j++;
            k++;
        }



        System.out.println(Arrays.toString(arr));
    }
}
