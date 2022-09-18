package com.company.binarysearch;

public class peakOfMountain {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,2,3,2};
        int t=2;
        int s = 0;
        int e = arr.length-1;
        int ans = binary(arr,s,e,t);
        System.out.println(ans);

    }
    static int binary(int[]arr,int s,int e,int t){
        while(s<=e) {

            int mid =  ((e+s) / 2) - 1;
            if(mid == 0 && arr[mid]==t){
                return mid;

            }
            if(mid == arr.length-1){
                return -1;
            }
            if (arr[mid]<arr[mid+1]){
                if (arr[mid]>t){
                    e = mid-1;
                }else if(arr[mid]<t){
                    s = mid+1;
                }else if (arr[mid] == t){
                    return mid;
                }
            }else{

                if (arr[mid]>t){
                    s=mid+1;
                }else if(arr[mid]<t){
                    e=mid-1;
                }else if (arr[mid] == t){
                    return mid;
                }

            }
        }
        return -1;
    }

}
