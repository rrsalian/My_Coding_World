package Problem;
import java.util.Scanner;
/***************************************************************************

5.	WAP to find the sum of all elements present in the even index of a given array. 

INPUT :
7
1     4     2      1       4    3     3  

OUTPUT:
10

 ******************************************************************************/
public class Array5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				sum+=ar[i];
			}
		}
		System.out.println(sum);
	}

}
