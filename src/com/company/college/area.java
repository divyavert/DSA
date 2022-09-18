package com.company.college;

public class area extends circle {

    public area(int[] x) {
        super(x);
    }

    public void circle(){
        double area = Math.PI*Math.pow(x[0],2);
        System.out.println(area);
    }
    public void rectagle(){
        double area = x[0]*x[1];
        System.out.println(area);
    }
    public void triangle(){
        double area = 0.5*(x[0]*x[1]);
        System.out.println(area);
    }
}
