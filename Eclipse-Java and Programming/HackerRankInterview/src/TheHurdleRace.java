import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/****************************************************************************************************
 
 https://www.hackerrank.com/challenges/the-hurdle-race/problem

*****************************************************************************************************/

public class TheHurdleRace {

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {

       // Arrays.sort(height);  Use can you this directly 
    	
    	for(int i=0;i<height.length;i++) {
    		for(int j=i;j<height.length;j++) {
    			if(height[i]>height[j]) {
    				int t=height[i];
    				height[i]=height[j];
    				height[j]=t;
    			}
    		}
    	}
       
        int n=height[height.length-1];
        int a=n-k>=0?n-k:0;
        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(System.in);
       int a[]=new int[2];
       for(int i=0;i<a.length;i++) {
    	   a[i]=sc.nextInt();
       }
       
       int b[]=new int[a[0]];
       for(int i=0;i<b.length;i++) {
    	   b[i]=sc.nextInt();
       }
       
       System.out.println(hurdleRace(a[1],b));
    }
}
