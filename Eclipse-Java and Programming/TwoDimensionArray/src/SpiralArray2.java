import java.util.Scanner;
public class SpiralArray2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row of Array");
		int n1=sc.nextInt();
		System.out.println("Enter the coloumn of Array");
		int n2=sc.nextInt();
		int ar[][]=new int[n1][n2];
		System.out.println("Enter the Elements of Array");
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		//display
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+"  ");
			}
			System.out.println();
		}
		//Output
		int top=0;
		int bottom=n1-1;
		int left=0;
		int right=n2-1;
		System.out.println("Output:");
		for(int i=0;i<n1;i++) {
			for(int j=left;j<=right;j++) {
				System.out.print(ar[top][j]+" ");
			}
			top++;
			for(int k=top;k<=bottom;k++) {
				System.out.print(ar[k][right]+" ");
			}
			right--;
			for(int l=right;l>=left;l--) {
				System.out.print(ar[bottom][l]+" ");
			}
			bottom--;
			for(int m=bottom;m>=top;m--) {
				System.out.print(ar[m][left]+" ");
			}
			left++;
		}
	}

}
