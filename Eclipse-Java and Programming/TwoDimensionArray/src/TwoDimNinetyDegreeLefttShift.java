import java.util.Scanner;
/******************************************************************************************
Two Dimension Array Ninety Degree Left Shift

Input: 
        1 2 3
        4 5 6
        7 8 9
Output:
        3 6 9 
		2 5 8 
		1 4 7  
		
********************************************************************************************/
public class TwoDimNinetyDegreeLefttShift {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2-D array size");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int a[][]=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		int ar[][]=new int[n][n];
		int k=2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ar[i][j]=a[j][k];
			}
			k--;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}
