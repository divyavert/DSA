package com.company.DataStructure.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>() ;
        q.add(23);
        q.add(33);
        q.add(4);
        q.remove();
        System.out.println(q);
    }
}
