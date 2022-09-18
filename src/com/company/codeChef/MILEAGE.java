package com.company.codeChef;

import java.util.Scanner;

public class MILEAGE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int A = (n/a)*x;
            int B = (n/b)*y;

            if(A>B){
                System.out.println("DIESEL");
            }else if(A==B)  {
                System.out.println("ANY");
            }else {
                System.out.println("PETROL");
            }

        }
    }
}
