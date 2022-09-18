package com.company.college;

public class triangle {

    double a;
    double b;
    double c;



    public triangle(double base, double height, double c) {
        this.a = base;
        this.b = height;
        this.c = c;
    }



    public double area(){
        return (double)(0.5*(a*b));
    }

}

