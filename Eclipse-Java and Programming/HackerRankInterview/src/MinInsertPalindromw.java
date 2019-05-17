/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

import java.util.*;

class MinInsertPalindromw {
    public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String s[]=new String[n];
      for(int i=0;i<s.length;i++){
          s[i]=sc.next();
      }
      for(int i=0;i<s.length;i++){
          int k=pali(s[i]);
          System.out.println(k);
      }

    }
    public static int pali(String s){
        StringBuilder rev=new StringBuilder(s).reverse();
        StringBuilder s1=new StringBuilder(s);
        int count=0;
        if(s1.toString().equals(rev.toString())){
            return count;
            
        }
        for(int i=0;i<s.length();i++){
        	
            rev.deleteCharAt(0);
            s1=new StringBuilder(rev).reverse();
            count++;
            if(s1.toString().equals(rev.toString())){
            	//System.out.println("***");
                return count;
            }
            
           
        }
        return count;
    }
}
