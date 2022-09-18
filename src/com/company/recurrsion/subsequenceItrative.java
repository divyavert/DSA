package com.company.recurrsion;

import java.util.ArrayList;

public class subsequenceItrative {
    public static void main(String[] args) {
        int arr []= {1,2,2};
        subset(arr);

    }

    private static void subset(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int n :arr){
            int m = outer.size();
            for (int i = 0; i <m ; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i)); // note this get(i) thing
                internal.add(n);
                if(outer.contains(internal)){
                    continue;
                }
                outer.add(internal);

            }
        }
        System.out.println(outer);
    }
    private static void subsetd(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length ; i++) {
            start = 0;
            if(i>0 && arr[i]==arr[i-1]){
                start = end+1;
            }
            end   = outer.size()-1;


            int m = outer.size();
            for (int j = start; j <m ; j++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(j)); // note this get(i) thing
                internal.add(arr[i]);
                outer.add(internal);

            }
        }
        System.out.println(outer);
    }
}
