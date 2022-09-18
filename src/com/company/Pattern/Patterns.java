package com.company.Pattern;

import java.util.ArrayList;

public class Patterns {
    public static void main(String[] args) {
        pattern8(3);

    }
    static void pattern1 (int n){
        for (int i = 0; i<n ;i++){
            for (int j = 0; j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2 (int n){
        for (int i = 0; i<n ;i++){
            for (int j = 0; j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3 (int n){
        for (int i = 0; i<n ;i++){
            for (int j = 0; j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4 (int n){
        for (int i = 0; i<n+1 ;i++){
            for (int j = 0; j<i;j++){
                System.out.print(j+1 );
            }
            System.out.println();
        }
    }

    static void pattern5 (int n){
        for (int i = 0; i<(2*n)-1 ;i++){
            if(i <= n){
                for (int j = 0; j<i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
            pattern3(n-1);
            return;
            }

        }
    }
    static void pattern6 (int n){
        for (int i = 1; i<2*n ;i++){
            for (int j = 1; j <= n; j++) {
                if (i <= n) {
                    if (j > n - i) {
                        System.out.printf("* ");
                    } else {
                        System.out.printf(" ");
                    }

                }else {
                    if (j >  i-n) {

                        System.out.printf("* ");
                    } else {
                        System.out.printf(" ");
                    }

                }
            }
            System.out.println();
        }
    }
    static void pattern7 (int n){
        for (int row = 1; row <=n ; row++) {
            for (int i = 0; i <n-row ; i++) {
                System.out.printf("  ");
            }
            for (int j =row; j>=1; j--){
                System.out.printf("%d ",j);
            }
            for (int k = 2;k<=row;k++){
                System.out.printf("%d ",k);
            }
            System.out.println();
        }
    }
    static void pattern8 (int n){

        for (int row = 1; row <(2*n) ; row++) {
            if (row < n) {
                for (int i = 0; i < n - row; i++) {
                    System.out.printf("  ");
                }
                for (int j = row; j >= 1; j--) {
                    System.out.printf("%d ", j);
                }
                for (int k = 2; k <= row; k++) {
                    System.out.printf("%d ", k);
                }

            }else{
                for (int i = 0; i <row-n; i++) {
                    System.out.printf("  ");
                }
                for (int l = (n - (row%n));l>0;l-- ){
                    System.out.printf("%d ", l);
                }
                for (int y = 2; y <=(n - (row%n)) ; y++) {
                    System.out.printf("%d ", y);

                }
            }
            System.out.println();
        }

    }

//    public static class ascii {
//        public static void main(String[] args) {
//            String up = "divya";
//            System.out.println(subse("",up));
//        }
//
//        private static ArrayList<String> subse(String a , String up) {
//            if(up.isEmpty()){
//                ArrayList<String> list = new ArrayList<>();
//                list.add(a);
//                return list;
//
//            }
//            char ch = up.charAt(0);
//
//            ArrayList<String> left = subse(a+ch,up.substring(1));
//
//            ArrayList<String> left = subse(a+,up.substring(1));
//
//            ArrayList<String> right = subse(a,up.substring(1));
//
//           left.addAll(right);
//           return left;
//        }
//    }
}
