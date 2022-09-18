package com.company.binarysearch;

public class rotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {2,9,22};
        int e = arr.length - 1;
        int t = 9;
        int min = min(arr,0,e);
        int ans = binary(arr,0,min-1,t);

       if(ans == -1){
           ans = binary(arr,min,e,t);
    }

        System.out.println(ans);

    }

   static int min(int[] arr,int s ,int e) {
        while (s<e){
            int mid = (s+e)/2;
//        case 1
            if( mid !=0 &&arr[mid]<arr[mid-1]) {
                return mid;
            }
            // case 2
            if(mid != arr.length-1 && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            if(arr[mid]>=arr[s]){
                s = mid+1;
            }
            if(arr[mid]<arr[s]){
                e = mid-1;
            }
        }
        return -1;


    }

    static int binary(int[] arr, int s, int e, int t) {
        while (s <= e) {
            int mid = (s+e)/2;
            if (arr[mid] > t) {
                e = mid - 1;
            } else if (arr[mid] < t) {
                s = mid + 1;
            } else if (arr[mid] == t) {
                return mid;
            }
        }
        return -1;
    }

}