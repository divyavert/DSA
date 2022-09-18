package com.company.oops;


 public class son extends parent{

        int sage ;
        public son(int age,int sage) {
            this.age = age;
            this.sage=sage;
        }

     @Override
     public void carrier() {
         System.out.println("ayo it's your boy");
     }

     public void age(){
            System.out.println(this.age);
            System.out.println(super.age);
        }
 }