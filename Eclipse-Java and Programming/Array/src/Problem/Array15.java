package Problem;
import java.util.Scanner;
/**************************************************************************

15.	WAP to find the 2nd largest number in an unsorted array without sorting.
INPUT :
7
1    4    2      10       14    30    3  

OUTPUT:
14


 **************************************************************************/

public class Array15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int index=-1;
		int lr=0;
		int sl=0;
		for(int i=0;i<n;i++) {
			if(ar[i]>lr) {
				sl=lr;
				lr=ar[i];
			}
			else if(ar[i]>sl) {
				sl=ar[i];
			}
		}
		System.out.println(sl);
	}
}
