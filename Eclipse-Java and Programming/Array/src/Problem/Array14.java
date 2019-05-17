package Problem;
import java.util.Scanner;
/**************************************************************************

14.	WAP to find the largest number in an unsorted array
INPUT :
7
1    4    2      10       14    30    3  

OUTPUT:
30


 **************************************************************************/

public class Array14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int index=-1;
		int lr=ar[0];
		for(int i=0;i<n;i++) {
			if(ar[i]>lr) {
				lr=ar[i];
			}
		}
		System.out.println(lr);
	}
}
