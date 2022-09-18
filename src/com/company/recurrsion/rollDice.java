package com.company.recurrsion;

import java.sql.Array;

public class rollDice {
    public static void main(String[] args) {
        int traget = 3;
        roll(traget,"");

    }

    private static void roll(int traget, String s) {
        if (traget == 0){
            System.out.println(s);
            return;
        }
        for (int i = 1; i <=traget; i++) {

                roll(traget-i, s+i);



        }
    }
}
