package com.company.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class threeSum {

    public static void main(String[] args) {
    int[] arr ={-1,0,1,2,-1,-4,-2,-3,3,0,4};
        List<List<Integer>> list = theeSum(arr);
        for (List a :list) {System.out.println(a);
        }
    }
   public static List<List<Integer>> theeSum(int[] nums) {
    int s = 0;
    int e = nums.length-1;
       List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);

    while (s<e){
        int t = s+1;
        boolean c = true;
        while(e>t && t>s){
            int x = nums[e]+nums[t]+nums[s];
            if(x>0) {
                e--;
                c = false;
                break;
            }else if (x<0){
                t++;
            }if (x==0){
                List<Integer> ne = new ArrayList<>();
                ne.add(nums[s]);
                ne.add(nums[t]);
                ne.add(nums[e]);
                if(!list.contains(ne)){
                    list.add(ne);
                } 
                t++;

            }


        }
        if(c){
            s++;
            while (nums[s]==nums[s-1]){
                    s++;
            }

        }

    }
return list;
    }
}