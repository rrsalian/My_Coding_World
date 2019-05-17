import java.io.*;
import java.util.*;

/************************************************************************************

https://www.hackerrank.com/challenges/find-digits/problem


Sample Input
2
12
1012

Sample Output
2
3

**************************************************************************************/

public class FindDigits {

    // Complete the findDigits function below.
    static int findDigits(int n) {
        int count=0;
        int num=n;
        while(n!=0){
            int rem=n%10;
            n/=10;
            if(rem==0){
                continue;
            }
            count=num%rem==0?count+1:count;
            
        }

        return count; 
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<a.length;i++) {
    	 a[i]=sc.nextInt();
     }
     for(int i=0;i<a.length;i++) {
    	 System.out.println(findDigits(a[i]));
     }
    }
}
