package com.company.interfaces;

public class electroinc implements engine{

    @Override
    public void start() {
        System.out.println("electronic start");
    }

    @Override
    public void stop() {
        System.out.println("electronic stop");
    }
}
