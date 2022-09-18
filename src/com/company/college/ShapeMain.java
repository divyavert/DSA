package com.company.college;

public class ShapeMain {
    public static void main(String[] args) {
        rectangle box = new rectangle(2,3,2,3);
        triangle trinagle = new triangle(2,3,4);
        circle1 cricle = new circle1(6);
        System.out.println(box.area());
        double arr = trinagle.area();
        System.out.println(arr);
        double arr2 = cricle.area();
        System.out.println(arr2);

    }
}
