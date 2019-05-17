package rakshith;

/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class FullStack {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        int aa[]={a,b};
        int bb[]={c,d};
        int count=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                int x=aa[i];
                int y=bb[j];
                System.out.println(x+" "+y);
                while(x!=y){
                	
                	
                	
                    if(x>y){
                        x=x-y;
                    }
                    else if(x<y){
                        y=y-x;
                    }
                    else{
                        x=1;
                        y=1;
                    }
                    count++;
                    System.out.println(x+""+y);
                    System.out.println("         "+count);
                }
                count++;
            }
        }
        System.out.println(count);


   }
}

