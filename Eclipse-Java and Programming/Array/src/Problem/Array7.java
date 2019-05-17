package Problem;
import java.util.Scanner;
/***************************************************************************

7.	WAP to find the product of all numbers in a given array

INPUT:
6
2     3      4     2      1   8

OUTPUT : 384


 ******************************************************************************/
public class Array7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int prd=1;
		for(int i=0;i<n;i++) {
			prd*=ar[i];

		}
		System.out.println(prd);
	}

}
