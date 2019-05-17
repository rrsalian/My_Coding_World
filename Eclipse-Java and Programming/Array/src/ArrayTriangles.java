import java.util.Scanner;
/*******************************************************************************************

		    1 2 3
		    4 5 6
		    7 8 9
Output:
Upper Triangle Right Side
             1 2 3 
             4 5 
             7 
Upper Triangle Left Side
            1 2 3 
              5 6 
                9 
Lower Triangle Right Side
            1 
            4 5 
            7 8 9 
Lower Triangle Left Side
                3 	
              5 6 
			7 8 9 

***********************************************************************************************/
public class ArrayTriangles {
	public static void main(String args[]) {
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

		//Upper Triangle 
		System.out.println("Upper Triangle Right Side");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Upper Triangle Left Side");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j>=i) {
				System.out.print(a[i][j]+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		//Lower Triangle
		System.out.println("Lower Triangle Right Side");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Lowe Triangle Left Side");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j>=n-i-1) {
				System.out.print(a[i][j]+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
	}
}
