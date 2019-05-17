package Problem;
import java.util.Scanner;

/***************************************************

19.	WAP to remove duplicates in a given array.
INPUT :
7
1    4    6      1       9    4    0  
OUTPUT:
1   4   6   9   0

 ***************************************************/

public class Array19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int ar1[]=new int[n];
		int l=0;

		for(int i=0;i<n;i++) {
			boolean k=false;
			for(int j=0;j<l;j++) {
				if(ar[i]==ar1[j]) {
					k=true;
				}
			}
			if(k==false) {
				ar1[l]=ar[i];
				l++;
			}
		}
		for(int i=0;i<l;i++) {
			System.out.print(ar1[i]+" ");
		}
	}
}
