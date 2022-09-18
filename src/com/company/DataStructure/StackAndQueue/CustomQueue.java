package com.company.DataStructure.StackAndQueue;

public class CustomQueue {
    protected int data [];
    private static final int Default_Size = 10;
    private int top = -1;

    public void add(int val) throws Exception{
        if(isfull()){
            throw new Exception("cannot add in full stack");
        }
        top++;
        data[top]= val;
    }

    public int remove () throws Exception{
        if(isempty()){
            throw new Exception("cannot remove from empty stack");
        }
        int remove = data[0];
        int j = top;
        for (int i = 1; i <top ; i++) {
            data[i-1] = data[i];

        }
        return remove;
    }

    public void display(){
        System.out.print("Start ");
        for (int i = 0; i <=top; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("end");
    }

    public CustomQueue() {
        this.data = new int[Default_Size];

    }

    public CustomQueue(int size) {
        this.data = new int[size];

    }

    private boolean isempty() {
        return top == -1;
    }

    private boolean isfull() {
        return top == data.length-1;
    }

    public static void main(String[] args) throws Exception {
        CustomQueue q = new CustomQueue();
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.display();
        System.out.println(q.remove());
        q.display();

    }
}
