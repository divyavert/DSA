package com.company.leetcode;

import java.util.Stack;

public class q232 {
    public static void main(String[] args) {

    }


}
class queuestack{
Stack<Integer>main = new Stack<>();
Stack<Integer> secondary = new Stack<>();
public void push(int x){
    this.main.push(x);
}
public int pop(int x){
    while(!this.main.isEmpty()){
        this.secondary.push(this.main.pop());
    }
    int r = this.secondary.pop();
    while(!this.secondary.isEmpty()){
        this.main.push(this.secondary.pop());
    }
    return r;
}
public int peek(int x) {
    while (!this.main.isEmpty()) {
        this.secondary.push(this.main.pop());
    }
   int r = this.secondary.peek();
    while (!this.secondary.isEmpty()) {
        this.main.push(this.secondary.pop());
    }
    return r;
}

public boolean empty(){
    return this.main.isEmpty();
}

}
