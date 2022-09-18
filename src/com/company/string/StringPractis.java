package com.company.string;

public class StringPractis {
    public static void main(String[] args)
    {
        StringBuilder name = new StringBuilder();
        for (int i = 0; i<26;i++){
            char n = (char)('a'+i);
            System.out.println(n);
            name = name.append(n) ;
            System.out.println(name);
        }

    }


}
