package com.company.interfaces;

public class cd implements mediaplayer{
    @Override
    public void start() {
        System.out.println("on");
    }

    @Override
    public void stop() {
        System.out.println("off");
    }
}
