package com.company.leetcode;

import java.sql.Array;
import java.util.ArrayList;

public class q792 {
    public static void main(String[] args) {
        String s = "abc";
        String words [] ={"a","bb","acd","ace"};
        int n = 0;
      int ans =  sub(s,words,"",n);

        System.out.println(ans);

    }

    private static int sub(String s, String[] words,String ps,int n ) {
        if(s.isEmpty()){
            for (String i :words){
                if(ps.equals(i)){
                    n++;
                }
            }
            return n;
        }
        char ch = s.charAt(0);
        int l = sub(s.substring(1),words,ps+ch,n);
       int  r = sub(s.substring(1),words,ps,n);
       return l+r;

    }
}
