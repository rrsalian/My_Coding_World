package Problem;
import java.util.Scanner;
/***************************************************************************

2.	WAP to find the mean of the given array.

INPUT : 
10
1     3     4     6     7     8    9    10     15        18  
OUTPUT:
8
 ******************************************************************************/
public class Array2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=ar[i];
		}
		System.out.println(sum/n);
	}

}
