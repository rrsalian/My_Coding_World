import java.util.Scanner;
public class Multiplication {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		//Array 1
		System.out.println("Enter the row of Array1");
		int n1=sc.nextInt();
		System.out.println("Enter the coloumn of Array1");
		int n2=sc.nextInt();
		int ar1[][]=new int[n1][n2];
		System.out.println("Enter the Elements of Array1");
		for(int i=0;i<ar1.length;i++) {
			for(int j=0;j<ar1[i].length;j++) {
				ar1[i][j]=sc.nextInt();
			}
		}
		//Array 2
		System.out.println("Enter the row of Array2");
		int m1=sc.nextInt();
		System.out.println("Enter the coloum of Array2");
		int m2=sc.nextInt();
		System.out.println("Enter the Elements of Array2");
		int ar2[][]=new int[m1][m2];
		for(int i=0;i<ar2.length;i++) {
			for(int j=0;j<ar2[i].length;j++) {
				ar2[i][j]=sc.nextInt();
			}
		}
		//Multiplication
		int ar3[][]=new int[n1][m2];
		for(int i=0;i<n1;i++) {
			for(int j=0;j<m2;j++) {
				for(int k=0;k<n2;k++) {
					ar3[i][j]+=ar1[i][k]*ar2[k][j];
				}
			}
		}
		//output
		System.out.println("Output :");
		for(int i=0;i<ar3.length;i++) {
			for(int j=0;j<ar3[i].length;j++) {
				System.out.print(ar3[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
