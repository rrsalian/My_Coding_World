package Problem;
import java.util.Scanner;
/**************************************************************************

17.	WAP to find all pairs of integers whose sum is equal to a given number 
in an unsorted array.
INPUT :
7
1    4    6      10       9    30    0  
10		(It is the sum that the pairs of numbers will be equal to)

OUTPUT:
1   9
4   6
10  0

 **************************************************************************/
public class Array17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(ar[i]+ar[j]==sum) {
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}
}
