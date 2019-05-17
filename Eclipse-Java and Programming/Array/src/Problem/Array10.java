package Problem;
import java.util.Scanner;
/***************************************************************************

10.	WAP to find duplicate number on Integer array in Java.

INPUT :
7
1     4     2      1       4    3     3  

OUTPUT:
1     3      4

 ******************************************************************************/
public class Array10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int prd=1;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(ar[i]==ar[j]) {
					System.out.print(ar[i]+" ");
				}
			}
		}
	}
}
