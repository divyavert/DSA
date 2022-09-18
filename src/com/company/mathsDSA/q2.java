package com.company.mathsDSA;

public class q2 {
    public static void main(String[] args) {
        int arr [] = {2,1,4,1,6,2,3,4,6};
//        isrepeated(arr);
        repate(arr);
    }
    static void isrepeated(int arr[]){
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length;) {
                if(i==j){
                    j++;
                }else if((arr[j] ^ arr[i])==0){
                    flag = 1;
                    break;
                }else {
                    j++;
                }
                flag = 0;
            }

            if(flag == 0){
                System.out.println(arr[i]);
            }
        }
    }

    static void repate(int arr[]){
        int unique = 0;
        for (int n:arr
             ) {
            unique ^= n;
        }

        System.out.println(unique);
    }
}
