package com.company.leetcode;

import java.util.Stack;

public class q921 {
    public static void main(String[] args) {
        String s= "(((";
        System.out.println(vaild(s));
    }

        private static int vaild(String s) {
            Stack<Character>st = new Stack<>();
            for (int i = 0; i <s.length(); i++) {
                if(s.charAt(i)=='('){
                    st.push(s.charAt(i));
                }else {

                        if(!st.isEmpty()&&s.charAt(i)==')'&&st.peek()=='('){
                            st.pop();
                        }else{
                            st.push(s.charAt(i));
                        }
                    }

                }
            return st.size();
            }

}

