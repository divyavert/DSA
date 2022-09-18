package com.company.string;

import java.util.Arrays;

public class longestPrefiexiSuffiex {
    public static void main(String[] args) {
        String s = "abbcbabbab";
       int [] lsp= fillup(s,s.length());
        System.out.println(Arrays.toString(lsp));

    }

    public static int naive(String s, int n) {

        for (int i = n-1; i >0 ; i--) {
            boolean fl = true;
            for (int j = 0; j <i; j++) {
                if(s.charAt(j)!=s.charAt(n-i+j)){
                    fl = false;
                }
            }
            if (fl){
                return i;
            }

        }
        return 0;
    }
    public static int[] fillup(String s,int n)
    {
        int [] lsp = new int[n];
        for (int i = 0; i <n; i++) {
            lsp[i]= naive(s,i+1);
        }
        return lsp;
    }

}
