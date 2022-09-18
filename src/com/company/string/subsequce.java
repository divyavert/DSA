package com.company.string;

import java.util.ArrayList;

public class subsequce {
    public static void main(String[] args) {
        String s = "abcde";
        String traget ="ande";
        ArrayList<String> list = new ArrayList<>();
         Subsequce(s,"",list);

        System.out.println(list);
        System.out.println(list.contains(traget));
        System.out.println( SUbsequce(s,traget,s.length()-1,traget.length()-1));


    }

    private static boolean SUbsequce(String s, String traget,int sn , int tn) {
        if(tn==0)
            return true;
        if(sn==0)
            return false;
        if(s.charAt(sn)== traget.charAt(tn)){
            return SUbsequce(s,traget,sn-1,tn-1);
        }else {
            return SUbsequce(s,traget,sn-1,tn);
        }
    }

    // finding all sequence quite bad complexity
    private static void Subsequce(String upr, String pr, ArrayList<String> list) {
        if(upr.equals("")){
            list.add(pr);
            return;
        }

        char s = upr.charAt(0);
        Subsequce(upr.substring(1),pr+s,list);
        Subsequce(upr.substring(1),pr,list);
    }
// checking each char in traget if they exist in string in same in order
// we keep two pointer if they match we increase both if not we in pointer of string
// recursive solution


}
