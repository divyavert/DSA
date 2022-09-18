package com.company.college;

import java.util.Locale;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int l = length(s);
        System.out.println(l);
        int r = vovels(s);
        System.out.println("vovel"+r+" "+(s.length()-r));

    }

    static int length (String s){
        int l = s.length();
        String s1 = s.substring(0,(s.length()/2));
        String s2 = s.substring((s.length()/2));
        System.out.println(s1+" "+s2);
        return l;
    }
    static int vovels (String s){
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i <s.length() ; i++) {

            if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }

        }
        return count;
    }
}
