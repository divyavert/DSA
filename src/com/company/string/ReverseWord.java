package com.company.string;

import java.util.Stack;

public class ReverseWord {
    public static void main(String[] args) {
        String s ="wellcome to gfg";
        Stack<Character> st = new Stack();
        for (int i = s.length()-1;i>=0;i--) {

            if(s.charAt(i)!=' '){
                st.push(s.charAt(i));
            }else {
               while (!st.isEmpty()){
                   System.out.print(st.pop());
               }
                System.out.print(" ");
            }
        }
        while (!st.isEmpty()){
            System.out.print(st.pop());
        }
    }
}
