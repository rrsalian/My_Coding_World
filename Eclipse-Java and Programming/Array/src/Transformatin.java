import java.util.Scanner;
public class Transformatin {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n");
		int n=sc.nextInt();
		System.out.println("Enter the Elemnts");
		int ar[][]=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("Without Transformation");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		int ar1[][]=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ar1[i][j]=ar[j][i];
			}
		}
		System.out.println("Transformation Array");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(ar1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
