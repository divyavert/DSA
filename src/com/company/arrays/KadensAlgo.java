package com.company.arrays;

public class KadensAlgo {
    public static void main(String[] args) {
        int [] a = {-2,-3,4,-1-2,1,5,-3};
        int s = 0;
        int end = 0;
        int max = 0;
        int cadd = 0;
        int i =0;
        while (i<a.length){
            cadd +=a[i];
            i++;
            if(cadd<0){
                s = i;
                cadd =0;
            }
            if(cadd>max){
                max = cadd;
                end = i;
            }


        }

        for (int j = s; j <end ; j++) {
            System.out.print(a[j]+", ");

        }
        System.out.println();
        System.out.println("max = "+max);
    }
}
