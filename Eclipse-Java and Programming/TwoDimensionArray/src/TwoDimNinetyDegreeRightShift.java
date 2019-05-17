import java.util.Scanner;
/***************************************************************************************
 Two Dimension Array Ninety Degree Right Shift
Input: 
        1 2 3
        4 5 6
        7 8 9
Output:
        7 4 1 
		8 5 2 
		9 6 3 
*****************************************************************************************/
public class TwoDimNinetyDegreeRightShift {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2-D array size");
		int n=sc.nextInt();
		int a[][]=new int [n][n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		int ar[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			int k=2;
			for(int j=0;j<n;j++) {
				ar[i][j]=a[k][i];
				k--;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}
