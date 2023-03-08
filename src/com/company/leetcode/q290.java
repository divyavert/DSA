package com.company.leetcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class q290 {
    public static void main(String[] args) {
        String str = "dog cat cat fish fish";
        String p = "abbcc";

        System.out.println(wordPattern(str,p));
    }

     static boolean wordPattern(String s, String pattern) {
         ArrayList<ArrayList<Integer>> spaces = new ArrayList<>();
         int se =0;
         int ee = 0;
         int store = 0;
         while (se<s.length()){
             store = se;
             while ( se < s.length() && s.charAt(se)!= ' ' ){
                 se++;
             }
             ArrayList<Integer> ne = new ArrayList<>();
             ne.add(store);
             ne.add(se);
             spaces.add(ne);
             se++;
         }
         String[] strA = new String[spaces.size()];
         int i = 0;
         for (ArrayList<Integer> a:spaces){
             String s1 = s.substring(a.get(0),a.get(1));
             strA[i]= s1;
             i++;
         }

         if(strA.length != pattern.length()){
             return false;
         }
         HashMap<Character,String> map = new HashMap<>();
         for (int j = 0; j <strA.length; j++) {
             if(!map.containsKey(pattern.charAt(j)) && !map.containsValue(strA[j])){
                 map.put(pattern.charAt(j),strA[j]);
             }else if (map.containsKey(pattern.charAt(j)) && map.containsValue(strA[j])) {
                String m = map.get(pattern.charAt(j));
                if(!m.equals(strA[j])){
                    return false;
                }
             }else {
                 if(!map.containsKey(pattern.charAt(j)) && map.containsValue(strA[j])){
                     return false;
                 }
                 if(map.containsKey(pattern.charAt(j)) && !map.containsValue(strA[j])){
                     return false;
                 }
             }

         }

        return true;
    }
}
