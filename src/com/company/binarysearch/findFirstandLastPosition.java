package com.company.binarysearch;

public class findFirstandLastPosition {
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int target = 10;
        int start= stbinary(nums,0, nums.length-1,target);
        int end = edbinary(nums,0, nums.length-1,target);
        int []ans = {start,end};
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }




    }
    static int stbinary(int[]arr,int s,int e,int t){
        int st=-1;

        while(s<=e) {
            int mid = (s+e)/2;
            if (arr[mid]>t){
                e = mid-1;
            }else if(arr[mid]<t){
                s = mid+1;
            }else if (arr[mid] == t){
                st = mid;
                e = mid-1;



            }
        }

       return st;
    }

    static int edbinary(int[]arr,int s,int e,int t){
        int ed=-1;

        while(s<=e) {
            int mid = (s+e)/2;
            if (arr[mid]>t){
                e = mid-1;
            }else if(arr[mid]<t){
                s = mid+1;
            }else if (arr[mid] == t){
                ed = mid;
                s= mid+1;


            }
        }

        return ed;
    }
}

