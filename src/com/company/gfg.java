package com.company;

import java.util.ArrayList;

public class gfg {
    public static void main(String[] args) {
    int arr[] = {1,2,4,5};
    int n = arr.length;
    int x = 4;
        System.out.println(has(arr,n,x));
    }
    static boolean has(int arr[], int n, int x) {
        ArrayList<Integer> ans = new ArrayList();

        for(int i = 0; i <n;i++){
            if(arr[i]<x){
                if(ans.contains(Math.abs(arr[i]-x))&&(arr[i]-x!=arr[i])){
                    return true;
                }else
                {
                    ans.add(arr[i]);
                }
            }

        }

        return false;
    }
}
