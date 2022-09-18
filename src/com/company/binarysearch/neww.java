package com.company.binarysearch;

import java.util.*;

public class neww {
    public static void main(String[] args) {
        int n[] = {1,0,0,1};
        moveZeroes(n);
    }
    public static void moveZeroes(int[] nums) {
        int f = 0;
        int e = nums.length-1;
        while(f < e){
            if(nums[f]==0){
                for(int i = f+1 ;i<=e;i++){
                    nums[i-1]=nums[i];
                }
                nums[e]=0;

                if(nums[f]!=0){
                    f++;
                }

                e--;
            }else{
                f++;
            }
        }
    }
}
