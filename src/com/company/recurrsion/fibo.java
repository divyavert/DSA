package com.company.recurrsion;

public class fibo {
    public static void main(String[] args) {
     int k =   fibo(11);
        System.out.println(k);
    }
    static int fibo (int n){


        if(n==0){
            return 0;
        }else if (n==1){
            return 1;
        }else {
            int ans = fibo(n-2)+fibo(n-1);
            return ans;
        }
    }
}
