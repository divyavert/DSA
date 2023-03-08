package com.company.HackerRAnk;

import java.util.Stack;

public class StackGame {
    public static void main(String[] args) {
        Stack<Integer>one = new Stack<>();
        Stack<Integer>sec = new Stack<>();
        one.push(4);
        one.push(2);
        one.push(4);
        one.push(6);
        one.push(1);
        sec.push(2);
        sec.push(1);
        sec.push(8);
        sec.push(5);
        int count = 0;
        int sum = 0;
        int maxSum = 10;
        int a = game(one,sec,sum,count,maxSum);
        System.out.println(a);
    }

    private static int game(Stack<Integer> one, Stack<Integer> sec, int sum, int count, int maxSum) {
        if(sum >= maxSum){
            return count;
        }
        if(one.isEmpty() || sec.isEmpty()){
            return count;
        }
        int fs = one.peek();
        int ss = sec.peek();
        Stack<Integer>onec = one;
        Stack<Integer>secc = sec;


        onec.pop();
        secc.pop();
        int f = game(onec,sec,sum+fs,count+1,maxSum);
        int s = game(one,secc,sum+ss,count+1,maxSum);
        return Math.max(f,s);
    }

}
