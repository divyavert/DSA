package com.company.college;

public class inputiter implements ci,recta {
    int x;
    int y;

    public inputiter(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public inputiter(int x) {
        this.x = x;
    }

    @Override
    public void area() {
        double area = Math.PI*Math.pow(x,2);
        System.out.println(area);
    }
    public void rearea(){
        double area = x*y;
        System.out.println(area);

    };
}
