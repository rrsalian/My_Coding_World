import java.util.Scanner;
public class SpiralArrayCreation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		int n=sc.nextInt();
		int ar[][]=new int[n][n];

		//Output
		int p=1;
		int top=0;
		int bottom=n-1;
		int left=0;
		int right=n-1;
		//Logic
		for(int i=0;i<n;i++) {
			for(int j=left;j<=right;j++) {
				ar[top][j]=p;
				p++;
			}
			top++;
			for(int k=top;k<=bottom;k++) {
				ar[k][right]=p;
				p++;
			}
			right--;
			for(int l=right;l>=left;l--) {
				ar[bottom][l]=p;
				p++;
			}
			bottom--;
			for(int m=bottom;m>=top;m--) {
				ar[m][left]=p;
				p++;
			}
			left++;
		}

		//display
		System.out.println("Output:");
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.printf("%-4s",ar[i][j]);
			}
			System.out.println();
		}
	}

}
