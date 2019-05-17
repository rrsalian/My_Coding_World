package Problem;
import java.util.Scanner;
/***************************************************************************

9.	WAP to find the product of all odd numbers in a array

INPUT :
7
1     4     2      1       4    3     3  

OUTPUT:
9

 ******************************************************************************/
public class Array9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int prd=1;
		for(int i=0;i<n;i++) {
			if(ar[i]%2==1) {
				prd*=ar[i];
			}
		}
		System.out.println(prd);
	}

}
