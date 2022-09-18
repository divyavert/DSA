package com.company.oops;

import java.util.Arrays;

public class ArrraylistGenDemo<t> {
    private int  DEFAULT_SIZE = 8;
    private int  size = 0;
    private Object[] list ;

    public ArrraylistGenDemo() {
        this.list = new Object[DEFAULT_SIZE];
    }

    void add(t x){
       if(isfull()){
           resize();
       }
      list[size++]= x;
    }

    private void resize() {
        DEFAULT_SIZE *= 2;
        Object temp [] = new Object[DEFAULT_SIZE];
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

    t remove (){

        t temp = (t)list[size];
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
        ArrraylistGenDemo list = new ArrraylistGenDemo();

        for (int i = 0; i <10; i++) {
            list.add(10);
        }
        System.out.println(list);
    }
}
