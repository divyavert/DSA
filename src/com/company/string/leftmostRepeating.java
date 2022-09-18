package com.company.string;

public class leftmostRepeating {
    public static void main(String[] args) {
        String s = "geekforgeeks";
        int count [] = new int[256];
        int index = Integer.MAX_VALUE;
        for (int i = 0; i <s.length(); i++) {
            count[s.charAt(i)]++;
            if( count[s.charAt(i)]>1){
                index = Math.min(index,s.charAt(i));
            }

        }

        System.out.println((char)index);
    }
}
