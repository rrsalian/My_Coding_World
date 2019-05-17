import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int[][] ar = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for(int j=0;j<6;j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		int sum=-999999;
		for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				int total=0;
				total+=ar[i][j];
				for(int k=j-1;k<=j+1;k++) {
					total+=ar[i-1][k];
				}
				for(int l=j-1;l<=j+1;l++) {
					total+=ar[i+1][l];
				}
				//System.out.println(total);
				if(total>sum) {
					
					sum=total;
				}
			}
		}
		System.out.println(sum);
	}
}
