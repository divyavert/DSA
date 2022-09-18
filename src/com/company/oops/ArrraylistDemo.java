package com.company.oops;

import java.util.Arrays;

public class ArrraylistDemo {
    private int  DEFAULT_SIZE = 8;
    private int  size = 0;
    private int[] list ;

    public ArrraylistDemo() {
        this.list = new int[DEFAULT_SIZE];
    }

    void add(int x){
       if(isfull()){
           resize();
       }
      list[size++]= x;
    }

    private void resize() {
        DEFAULT_SIZE *= 2;
        int temp [] = new int[DEFAULT_SIZE];
        for (int i = 0; i <list.length; i++) {
            temp[i]=list[i];
        }
        list = temp;
    }

    private boolean isfull() {
        if (list.length-1==size){
            return true;
        }else {
            return false;
        }
    }

    int remove (){

        int temp = list[size];
        size--;
        return temp;
    }

    @Override
    public String toString() {
        return "ArrraylistDemo{" +
                "list=" + Arrays.toString(list) +
                '}';
    }

    public static void main(String[] args) {
        ArrraylistDemo list = new ArrraylistDemo();

        for (int i = 0; i <10; i++) {
            list.add(10);
        }
        System.out.println(list);
    }
}
