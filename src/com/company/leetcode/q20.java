package com.company.leetcode;

import java.util.Stack;

public class q20 {
    public static void main(String[] args) {
        String s= "]";
        System.out.println(vaild(s));
    }

    private static boolean vaild(String s) {
        Stack<Character>st = new Stack<>();
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));
            }else {
                if(st.isEmpty()){
                    return false;
                }else {
                    if((s.charAt(i)==')'&&st.peek()=='(')||(s.charAt(i)=='}'&&st.peek()=='{')||(s.charAt(i)==']'&&st.peek()=='[')){
                        st.pop();
                    }else{
                        return false;
                    }
                }

            }
        }
        return st.isEmpty();
    }
}
