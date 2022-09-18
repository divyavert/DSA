package com.company.Pattern;

public class parttt {
    public static void main(String[] args) {
        int a=0, b=1, c, d, j=2;
        int arr[] = new int[9];

        arr[0] = a;
        arr[1] = b;

        for(d=1;d<=7;d++)
        {
            c = a + b;
            arr[j] = c;
            a = b;
            b = c;
            j++;
        }

        c=0;
        for(a=1;a<=3;a++)
        {
            for(b=3;b>=a;b--)
            {
                System.out.print(" ");
            }

            for(b=1;b<=a;b++)
            {
                System.out.print(arr[c] + " ");
                c++;
            }
            System.out.println();
        }

        for(a=1;a<3;a++)
        {
            for(b=3*a;b>a;b--)
            {
                System.out.print(" ");
            }
            if(a==2)
                System.out.print("\b");

            for(b=2;b>=a;b--)
            {
                System.out.print(arr[c] + " ");
                c++;
            }
            System.out.println();
        }
    }
}
