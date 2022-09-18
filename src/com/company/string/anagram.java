package com.company.string;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        int i = 256;
        int a  [] = new int[i];
        String s ="lisetn";
        String p = "silent";
        for (int k = 0; k <s.length() ; k++) {
           a[s.charAt(k)]++;
           a[p.charAt(k)]--;
        }
        int flag = 0;
        for (int j:a) {
            if(j!=0){
                System.out.println(false);
                flag = -1;
                break;
            }

        }
        if(flag==0){
            System.out.println(true);
        }

    }
}
