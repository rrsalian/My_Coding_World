package Problem;
import java.util.Scanner;
/***************************************************

11.	WAP to replace the duplicates with 0.

INPUT :
7
1     4     2      1       4    3     3  

OUTPUT:

1   4  2   0   0   3   0

 ***************************************************/
public class Array11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(ar[i]==ar[j]) {
					count++;
				}
				if(count>1) {
					ar[j]=0;
					count=1;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(ar[i]+" ");
		}
	}
}
