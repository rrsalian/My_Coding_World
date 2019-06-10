package rakshith;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class New {
	public static void main (String[] args) {
		//code
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int a1[]=new int[a];
		for(int i=0;i<a1.length;i++){
		    a1[i]=sc.nextInt();
		}
		int b=sc.nextInt();
		int b1[]=new int[b];
		for(int i=0;i<b1.length;i++){
		    b1[i]=sc.nextInt();
		}
		
		    solution(a1);
		    solution(b1);
	}
	
	public static void solution(int ar[]){
	    Arrays.sort(ar);
	    int sum=ar[0]+ar[1];
	    
	    for(int i=2;i<ar.length;i++){
	        
	        sum+=ar[i];
	        
	    }
	    System.out.println(sum);
	}
}