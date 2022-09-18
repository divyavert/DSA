package com.company.recurrsion;

public class patterns {
    public static void main(String[] args) {
        patt(4,1);
    }

    private static void patt(int r, int c) {

        if(r == 0){
            return;
        };
        if(c>r){
            System.out.println();
            patt(r-1,1);

        }else {
            System.out.print("*");
            patt(r,c+1);

        }

    }

}
