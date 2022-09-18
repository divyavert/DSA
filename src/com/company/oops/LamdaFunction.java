package com.company.oops;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LamdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> add = new ArrayList<>();
        add.add(4);
        add.add(6);

        add.forEach((item)-> System.out.println(item*2));
        // -> this is lamda function used for single line function
        // in for each you can also store lamda function in consumer type

        Consumer <Integer> fun  = (item)-> System.out.println(item*2);
        add.forEach(fun);
        // so this how u store function in interface to use it you have to make method of it
        Operation sum = ((a, b) -> a+b);
        // sum is interface call its method operation
        System.out.println(sum.operation(5,7));
    }
//    private void operate (int as,int b,Operation op){
//        System.out.println(op.operation(a,b));


}
// if you want to call lamda function for more than one parameter then make a interface with that method
// interface must contain one method only
interface Operation {
    int operation (int a, int b);
}