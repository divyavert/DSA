package com.company.recurrsion;

public class sortedOrNot {
    public static void main(String[] args) {
        int arr[]= {1,2,3,67,5};
       boolean a = sorted(arr,0);
        System.out.println(a);
    }

    private static boolean sorted(int[] arr, int i) {
        if(i == arr.length-1){
            return true;
        }

        if(arr[i]<arr[i+1]){
           return sorted(arr,i+1);
        }else {
            return false;
        }
    }
}
