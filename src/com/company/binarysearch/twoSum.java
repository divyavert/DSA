package com.company.binarysearch;

public class twoSum {
    public static void main(String[] args) {
        int []arr={2,3,4,5};
        int target = 6;
        int []a = twosum(arr,target);
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);
        }


    }
    static int[] twosum(int[]arr,int target){
        for (int i =0;i<arr.length-1;i++){
            for (int j =i+1;j<arr.length;j++){
                int sum = arr[i]+arr[j];
                if(sum == target){
                    int []ans={i,j};
                    return ans;
                }
            }
        }
        int []no ={-1,-1};

        return no;
    }



}
