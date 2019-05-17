package Problem;
import java.util.Scanner;
/***************************************************************************

3.	WAP to find the sum of all odd numbers in an give array

INPUT :
6
2   4   6      3    7     1

OUTPUT:
11

 ******************************************************************************/
public class Array4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			if(ar[i]%2==1) {
				sum+=ar[i];
			}
		}
		System.out.println(sum);
	}

}
