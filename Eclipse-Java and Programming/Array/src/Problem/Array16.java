package Problem;
import java.util.Scanner;
/**************************************************************************

16.	WAP to find the 2nd smallest number in an unsorted array without sorting.
INPUT :
7
1    4    2      10       14    30    3  

OUTPUT:
2

 **************************************************************************/
public class Array16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int index=-1;
		int sml=ar[0]<ar[1]?ar[0]:ar[1];
		int ss=ar[0]<ar[1]?ar[1]:ar[0];
		for(int i=2;i<n;i++) {
			if(ar[i]<sml) {
				ss=sml;
				sml=ar[i];
			}
			else if(ar[i]<ss) {
				ss=ar[i];
			}
		}
		System.out.println(ss);
	}
}
