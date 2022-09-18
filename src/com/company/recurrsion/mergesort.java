package com.company.recurrsion;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int arr [] ={78,19,5,7,36};
         arr = ergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int [] ergesort(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left = ergesort(Arrays.copyOfRange(arr,0,mid));
        int [] right = ergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);

    }

    private static int [] merge(int[] left, int[] right) {
        int [] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i< right.length&&j<left.length){
            if(left[j]>right[i]){
                mix[k]=right[i];
                i++;

            }else {
                mix[k]= left[j];
                j++;
            }

            k++;


        }
        while (j<left.length){
            mix[k]=left[j];
            j++;
            k++;

        }

        while (i< right.length){
            mix[k]=right[i];
            i++;
            k++;
        }
        return mix;
    }
}
