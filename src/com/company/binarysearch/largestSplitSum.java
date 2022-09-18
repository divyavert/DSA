package com.company.binarysearch;

public class largestSplitSum {
    public static void main(String[] args) {
        int []nums ={7,2,5,10,8};
        int ans =lsum(nums);
        System.out.println(ans);
    }
    static int lsum(int[]nums){
        int j =0;
        int lsum = 999999999;

        while (j< nums.length){
            int sum1=0;
            int sum2 = 0;

            for (int i = 0; i <=j ; i++) {

                sum1 =sum1+ nums[i];
            }
            for (int k =j+1; k<nums.length;k++){

                sum2 = sum2 + nums[k];
            }
            lsum = Math.min(lsum,Math.max(sum1,sum2));

           j++;
        }

        return lsum;
    }
}
