import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/****************************************************************************************************


https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?h_r=next-challenge&h_v=zen



Sample Input 0

2
1 2 3
1 3 2
Sample Output 0

Cat B
Mouse C
*****************************************************************************************************/

public class CatsAnd_aMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {


        int catA=z-x>=0?z-x:x-z;
        int catB=z-y>=0?z-y:y-z;
        if(catA<catB){
            return "Cat A";
        }
        else if(catB<catA){
            return "Cat B";
        }
        else{
            return "Mouse C";
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
    	
    	Scanner sc=new Scanner(System.in);
          	
    	int n=sc.nextInt();
    	int a[][]=new int[n][3];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<3;j++) {
    			a[i][j]=sc.nextInt();
    		}
    	}
    	for(int i=0;i<n;i++) {
    		System.out.println(	catAndMouse(a[i][0],a[i][1],a[i][2]));
    	}
    }
}
