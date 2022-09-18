package com.company.codeChef;
import java.util.Scanner;
public class dazzlingChallenge {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int t = myObj.nextInt();
        while (t>0){
            int n = myObj.nextInt();
            if((n-1)%4==0){
                System.out.println(n);
            }else if(n%4==0){
                System.out.println(n+3);
            }else{
                System.out.println(3);
            }

        }
    }


}
