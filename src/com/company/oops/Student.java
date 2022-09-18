package com.company.oops;

public class Student implements Comparable<Student>{
    float marks;
    int roll;

    public Student(float marks, int roll) {
        this.marks = marks;
        this.roll = roll;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.marks - o.marks);
        return diff;
    }
}
