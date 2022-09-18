package com.company.college;

import java.util.Scanner;

public class Experiment1 {
    public static void main(String[] args) {
        int i = 8, j =3;
        System.out.println("addition:- "+(i+j));
        System.out.println("subtraction:- "+(i-j));
        System.out.println("multiplication:- "+(i*j));
        System.out.println("division:- "+(i/j));
        System.out.println("modulo:- "+(i%j));

        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount in ruppes");
        float r = sc.nextFloat();
        System.out.println(r/60);

        float a = sc.nextInt();
        System.out.println(a);

        float s = sc.nextInt();
        System.out.println(s);

        float d = sc.nextInt();
        System.out.println(d);

        float f = sc.nextInt();
        System.out.println(f);

        float g = sc.nextInt();
        System.out.println(g);

        float h = sc.nextInt();
        System.out.println(h);

       float  sum = a+s+d+f+g+h;
       float percentage = (sum/600)*100;

        System.out.println(percentage+"%");


    }
}
