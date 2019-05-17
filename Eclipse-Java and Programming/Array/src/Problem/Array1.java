package Problem;
import java.util.Scanner;
/***************************************************

1.	WAP to find the sum of an array.

	INPUT: 
	7
	5 4 6 1 2 1 2

	OUTPUT:
	21	

 ***************************************************/
public class Array1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=ar[i];
		}
		System.out.println(sum);
	}
}
