package com.company.recurrsion;

public class reverse {
    public static void main(String[] args) {
       int i =  rev2(1501 ,0);
        System.out.println(i);
    }

static int rev2(int n ,int sum){

        if(n==0){
            return sum;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        return rev2(n/10,sum);


}
    static int  rev(int n , int count ) {
        if(n==0){
            return count+1;
        }
        if (n/10  == 0) {
            return count;
        }

        if (n % 10 == 0) {
           return rev(n / 10, count+1);

        } else {
            return rev(n / 10, count);
        }

    }
}

