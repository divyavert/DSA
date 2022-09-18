package com.company.DataStructure.StackAndQueue;

public class CustomStack {
    protected int data [];
    private static final int Default_Size = 10;
    private int top = -1;
    public CustomStack() {
        this.data = new int[Default_Size];

    }
    public CustomStack(int size) {
        this.data = new int[size];

    }

    public void add(int val) throws Exception{
        if(isfull()){
            throw new Exception("cannot add in full stack");
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


    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack();
        stack.add(10);
        stack.add(9);
        stack.add(8);
        stack.add(7);
        stack.add(6);
        stack.add(5);
        stack.add(4);
        stack.add(3);
        stack.add(2);
        stack.add(1);
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());




    }
}
