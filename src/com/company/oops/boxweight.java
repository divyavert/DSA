package com.company.oops;

public class boxweight extends box{
    int weight;
    public  boxweight(){
    this.weight =-1;
    }
    public boxweight(int l, int h, int w, int weight) {
        super(l, h, w);
        this.weight = weight;
    }
}
