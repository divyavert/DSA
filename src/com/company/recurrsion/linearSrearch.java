package com.company.recurrsion;

public class linearSrearch {
    public static void main(String[] args) {
        int arr [] = {8,2,5,3,9};
       boolean i = search(arr,0,5);
        System.out.println(i);
    }

    private static boolean search(int[] arr, int i,int t) {
        if(i == arr.length){
            return false;
        }
        if(arr[i]==t){
            return true;
        }else {
            return search(arr,i+1,t);
        }
    }
}
