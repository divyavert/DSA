package com.company.interfaces;

public class powerengine implements engine{

    @Override
    public void start() {
        System.out.println("powerengine start");
    }

    @Override
    public void stop() {
        System.out.println("powerengine stop");
    }
}
