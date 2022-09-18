package com.company.DataStructure.StackAndQueue;

public class dynamicStack {
    protected int data [];
    private static final int Default_Size = 10;
    private int top = -1;
    public dynamicStack() {
        this.data = new int[Default_Size];

    }
    public dynamicStack(int size) {
        this.data = new int[size];

    }

    public void add(int val){
        if(isfull()){
            int nsize = (data.length*2);
           int arr [] = new int [nsize];
        }
        top++;
        data[top]= val;
    }

    private boolean isfull() {
        return top == data.length-1;
    }

    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("cannot remove from empty stack");
        }
        int removed = data[top];
        top--;
        return removed;

    }

    private boolean isempty() {
        return top == -1;
    }

    public int getTop() throws Exception{
        if(isempty()){
            throw new Exception("cannot show top of empty stack");
        }
        return data[top];
    }

}
