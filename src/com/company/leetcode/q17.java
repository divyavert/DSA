package com.company.leetcode;

public class q17 {
    public static void main(String[] args) {
        String s []= {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String up = "39";
        phone(up,s,"");
    }

    private static void phone(String up, String[] s, String p) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch =up.charAt(0);
        int chn = Character.getNumericValue(ch);
        String sup = s[chn-1];


        for (int i = 0; i <sup.length() ; i++) {
            phone(up.substring(1),s,p+sup.charAt(i));
        }

    }
}
