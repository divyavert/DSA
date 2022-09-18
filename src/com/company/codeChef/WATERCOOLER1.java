package com.company.codeChef;
import java.util.Scanner;
public class WATERCOOLER1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int m = sc.nextInt();
            int r = m*x;
            if(r<y){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }

    }
}
