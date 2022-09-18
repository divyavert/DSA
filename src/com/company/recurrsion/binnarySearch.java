package com.company.recurrsion;

public class binnarySearch {
    public static void main(String[] args) {
        int [] arr  = {3,4,5,7,8,9,11};
        binary(0,6,11,arr);
    }
    static void binary(int s ,int e,int target, int [] arr){
        int mid = (s+e)/2;
        if(arr[mid]== target){
            System.out.println(mid);
        }else if(arr[mid] >target){
            binary(s , mid-1,target ,arr);
        }else if (arr[mid]<target){
            binary(mid+1 , e,target, arr);
        }else {
            System.out.println("-1");
        }
    }
}
