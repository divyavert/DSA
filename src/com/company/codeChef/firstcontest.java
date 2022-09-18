package com.company.codeChef;
import java.util.Scanner;

public class firstcontest {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int no = sc.nextInt();
            int ye = sc.nextInt();
            int yes = n - no - ye;
            int a = ye + yes;
            System.out.printf("%d %d",a,yes);
    }
}
