package com.company.string;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int st =0;
        int en = s.length()-1;
        while(st<s.length()&&en>=0){
            if(s.charAt(st)==' '){
                System.out.print(" ");
                st++;
            }else if(s.charAt(en)==' '){
                en--;
            }else {
                System.out.print(s.charAt(en));
                st++;
                en--;

            }
        }
    }

}
