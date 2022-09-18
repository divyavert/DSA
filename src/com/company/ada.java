package com.company;

public class ada {
    public static void main(String[] args) {
        int arr [] = {2,4,5};
        int n =3;
        selection(arr,3);
    }
   static int smallest(int arr[],int i,int n){

        int index = i;

        for (int j = i; j < n; i++)
        {
            if(arr[j]<arr[index]){

                index = j;
            }
        }

        return index;

    }
   static void selection(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int small = smallest(arr, i, n);
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;

        }
    }
}
