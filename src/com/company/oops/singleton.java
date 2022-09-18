package com.company.oops;

public class singleton {

    int age = 1 ;
    private singleton() {
    age += 1;
    }

    private static singleton name ;

    static singleton create (){
        if(name == null){
            name = new singleton();
        }

        return name;
    }
}
