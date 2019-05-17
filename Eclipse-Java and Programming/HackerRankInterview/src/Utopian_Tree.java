import java.io.*;
import java.util.*;
/*******************************************************************************************
  
https://www.hackerrank.com/challenges/utopian-tree/problem


Sample Input
3
0
1
4

Sample Output
1
2
7

********************************************************************************************/


public class Utopian_Tree {

    // Complete the utopianTree function below.
    static int utopianTree(int n) {
        int hight=1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                hight+=hight;
            }
            else{
                hight+=1;
            }
        }
        return hight;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        
        int a[]=new int[t];
        for(int i=0;i<t;i++) {
        	a[i]=scanner.nextInt();
        }
        for(int i=0;i<t;i++) {
        	System.out.println(utopianTree(a[i]));
        }
        
    }
}
