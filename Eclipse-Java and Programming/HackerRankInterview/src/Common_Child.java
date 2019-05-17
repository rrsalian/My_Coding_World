import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Common_Child {

    // Complete the commonChild function below.
    static int commonChild(String s1, String s2) {

       char c1[]= s1.toCharArray();
       char c2[]= s2.toCharArray();

       Arrays.sort(c1);
       Arrays.sort(c2);

       s1=remove_du(c1);
       s2=remove_du(c2);
       
       int count=0;
       for(int i=0;i<s1.length();i++){
           for(int j=i;j<s2.length();j++){
               if(s1.charAt(i)==s2.charAt(j)){
            	   System.out.println(s1.charAt(i)+"@@@@@@@"+s2.charAt(j));
                   count++;
               }
           }
       }

        return count;


    }
    static String remove_du(char[] c){
        //char c[]=s.toCharArray();
        char temp[]=new char[c.length];
        int j=0;
        for(int i=0;i<c.length-1;i++){
            if(c[i]!=c[i+1]){
                temp[j]=c[i];
                j++;
            }

        }
        temp[j++]=c[c.length-1];
        String t="";
        for(int i=0;i<j;i++){
            t+=temp[i];
        }
        System.out.println(t);
        return t;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s1=scanner.next();
        String s2=scanner.next();
        
        System.out.println(commonChild(s1,s2));
    }
}
