package com.company.codeChef;

import java.util.ArrayList;

import java.util.Scanner;

public class MAKEPAL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
             int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            String l = sc.nextLine();
            String s = sc.nextLine();
//            ArrayList<String>ans = subseque(s,"");
            String an = pla2(s);
            System.out.println(an);
//         for (String o : ans){
//             String rev="";
//             for(int i=o.length()-1;i>=0;i--){
//                 rev+=o.charAt(i);
//             }
//             if(o.equals(rev)){
//                    if(o.length()>(n/2)){
//                        System.out.println(rev);
//                        break;
//                    }
//
//
//             }
//
//         }

        }


    }

    static String pla2(String s) {
        String anss = "";


        int count0 = 0;
        int count1 = 0;
        String a = "1";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a.charAt(0)) {
                count1++;
            } else {
                count0++;
            }
        }
        if (count0 > count1) {
            for (int i = 0; i < count0; i++) {
                anss = anss + "0";
            }
        } else{
                for (int i = 0; i < count1; i++) {
                    anss = anss + "1";
                }
        }


        return anss;
    }



    private static ArrayList<String> subseque(String si, String s) {
        if(si.isEmpty()){
            ArrayList<String>list = new ArrayList<>();
            list.add(s);
            return list;
        }

        char ch = si.charAt(0);

        ArrayList<String>left = subseque(si.substring(1),s+ch);
        ArrayList<String>right = subseque(si.substring(1),s);
        left.addAll(right);
        return left;

    }


}
