package com.company.oops;

public class ExpectionHandling {
    public static void main(String[] args) {
        int a = 7;
        int b = 0;
        // so you can use try and catch key word
        // you can catch an exception using it
        // exception itself is an object
        try{
            int c = a/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("i will always run you know");
        }





    }

    // this is how u throw exception in function
    // u have to delcare exception like here ⬇️
    void divide  (int a , int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("you can sent message here");
        }

        else System.out.println(a/b);
    }
}
