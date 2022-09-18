package com.company.interfaces;

public class car {
    private engine Engine;
    private mediaplayer cdp;

    public car() {
        Engine = new powerengine();
        cdp = new cd();
    }
     void start(){
        Engine.start();
     }
     void startmusic(){
        cdp.start();
     }
     void update(){
        Engine = new electroinc();
     }

}