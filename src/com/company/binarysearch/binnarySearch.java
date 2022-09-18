package com.company.binarysearch;

public class binnarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int t=14;
        int s = 0;
        int e = arr.length-1;
       int ans = binary(arr,s,e,t);
        System.out.println(ans);


    }
    static int binary(int[]arr,int s,int e,int t){
        while(s<=e) {
            int mid = s + (e-s / 2);
            if (arr[mid]>t){
                e = mid-1;
            }else if(arr[mid]<t){
                s = mid+1;
            }else if (arr[mid] == t){
                return mid;
            }
        }
        return s;
    }
}
