import java.io.*;
import java.util.*;

public class ForamingA_MagicSquare {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
    	for (int i=0;i<s.length;i++) {
    		int sum1=0;
    		int sum2=0;
    		for(int j=0;j<s[i].length;j++) {
    			sum1+=s[i][j];
    			sum2+=s[j][i];
    		}
    		System.out.println(i+" "+sum1);
    		System.out.println(i+" "+sum2);
    	}

    	return 0;
         
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	Scanner sc=new Scanner(System.in);
    	int s[][]=new int [3][3];
    	System.out.println("Enter the Matrix");  
    	for(int i=0;i<3;i++) {
    		for(int j=0;j<3;j++) {
    			s[i][j]=sc.nextInt();
    		}
    	
        }

        System.out.println(formingMagicSquare(s));

        
    }
}
