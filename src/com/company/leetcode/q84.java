package com.company.leetcode;

import java.util.Stack;

public class q84 {
    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        int ps [] = previous(heights);
        int ns [] = next(heights);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <ps.length; i++) {
            int area= 0;
            if(ns[i]==-1&&ps[i]==-1){
                area = heights[i] * (heights.length);
            }else if(ns[i]==-1){
                area = (heights.length-ps[i]-1 )* (heights[i]);
            }else if(ps[i]==-1){
                area = ns[i] * (heights[i]) ;
            }else {
                area =  (ns[i] - ps[i] - 1) * heights[i];
            }

             max = Math.max(max,area);
        }
        System.out.println(max);

    }

    private static int[] next(int[] heights) {
        int[] pr = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        for (int i = heights.length-1;i>=0;i--) {

            while (!st.isEmpty()&& heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pr[i]=-1;
            }else {
                pr[i]=st.peek();
            }
            st.push(i);

        }
        return pr;
    }

    private static int[] previous(int[] heights) {
        int[] pr = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <heights.length; i++) {
            while (!st.isEmpty()&& heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pr[i]=-1;
            }else {
                pr[i]=st.peek();
            }
            st.push(i);

        }
        return pr;
    }
}
