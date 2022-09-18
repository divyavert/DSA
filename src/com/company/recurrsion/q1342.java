package com.company.recurrsion;

public class q1342 {
    public static void main(String[] args) {
        int n = 123;
       int l =  count( n ,0);
        System.out.println(l);
    }

    private static int count(int n, int i) {
        if(n==0){
            return i;
        }
        if((n&1)==1){
            return count(n-1,i+1);
        }else {
            return count(n/2,i+1);
        }
    }
}
