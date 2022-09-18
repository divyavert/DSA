package com.company.string;

import java.util.ArrayList;
import java.util.Locale;

public class patternSearching {
    public static void main(String[] args) {
       String s ="geksekseseseses";
       String pat  ="se";
//       navie(s,pat);
       rb(s,pat);
    }

    private static void navie(String s, String pat) {
       char sarr []= s.toCharArray();
       char parr[] = pat.toCharArray();
       ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <=s.length()-pat.length(); ) {
            int st = i;
            int flag = 0;
            
            for (int j = 0; j <pat.length(); j++) {
                if(sarr[st]==parr[j]){
                    st++;
                }else {

                    flag= -1;
                    break;
                }
            }
            if(flag!=-1){
                list.add(i);
                i = i+st+1;

            }else {
                i = i+1;
            }
        }
        System.out.println(list);
    }

    public static void rabinKarp(String s,String pa){
        int d = 5;
        int h = 1;
        int q = 0;
        int flag = 0;
        for (int i = 0; i <pa.length()-1; i++) {
            h = h * d;
        }

        int p =0;
        for (int i = 0; i < pa.length(); i++) {
            p = p*d + pa.charAt(i);
            q = q*d + s.charAt(i);
        }

        for (int i = 0; i <i+pa.length() ;i++) {


            if (q == p){
                for (int j =0 ; j<pa.length();j++){

                    if(pa.charAt(j)!=s.charAt(i+j)){

                        break;

                    }
                    flag++;

                }
                if (flag == pa.length()){
                    System.out.println("found pattern at "+i);

                }

            }
            if (i<s.length()-pa.length()) {
                q = d*(q-(s.charAt(i)*(h)))+s.charAt(i+pa.length());
            }




        }



    }
    public static void rb(String s,String pa){
        int d = 5;
        int h = 1;
        int n = s.length();
        int m = pa.length();
        int p = 0;
        int t = 0;
        for (int i =0; i<m-1;i++){
            h = h * d;
        }
        for (int i = 0; i <m; i++) {
            p = p*d + pa.charAt(i);
            t = t*d + s.charAt(i);
        }
        for (int i = 0; i <=n-m ; i++) {
            if(p==t) {
                int fl = 0;
                for (int j = 0; j < m; j++) {
                    if (s.charAt(i + j) != pa.charAt(j)) {
                        break;
                    }
                    fl++; // mistake
                }
                if (fl == m) {
                    System.out.println("found pattern at " + i);
                }
            }
            if(i<n-m){
                t = d*(t - (s.charAt(i)*h)) +s.charAt(i+m);
            }

    }


}
}


