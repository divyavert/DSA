package com.company.binarysearch;

public class rotationCount {
    public static void main(String[] args) {
        int arr[] = {2, 9, 2, 2};
        int e = arr.length - 1;
        int t = 2;
        int min = min(arr, 0, e);
        int count = count(arr, 0, min);
        System.out.println(min);
        System.out.println(count);

    }

    static int min(int[] arr, int s, int e) {
        while (s < e) {
            int mid = (s + e) / 2;
//        case 1
            if (mid != 0 && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            // case 2
            if (mid != arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            if (arr[mid] >= arr[s]) {
                s = mid + 1;
            }
            if (arr[mid] < arr[s]) {
                e = mid - 1;
            }
        }
        return -1;


    }

    static int count(int[] arr, int s, int min) {
        int count = 0;
        int j = min - 1;
        while (j >= 0) {
            count++;
            j--;
        }
        return count;
    }
}

