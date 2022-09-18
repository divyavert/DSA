package com.company.oops;

public class StudentMain {
    public static void main(String[] args) {
        Student raju = new Student(88,3);
        Student divya = new Student(89.5f,1);

        if(raju.compareTo(divya)<0){
            System.out.println("divya has more marks");
        }
    }
}
