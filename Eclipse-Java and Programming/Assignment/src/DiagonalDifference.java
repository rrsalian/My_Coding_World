import java.util.Scanner;
/**************************************************************************************************************************
 
Sample Input:
3 
11  2  4 
4   5  6 
10  8 -12
Sample Output:
15
Explanation The primary diagonal is:
11 
   5   
     -12
Sum across the primary diagonal: 11 + 5 - 12 = 4 The secondary diagonal is:
     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15 

*********************************************************************************************************************************/
public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s1=0;
		int s2=0;
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
				if(i==j) {
					s1+=a[i][j];
				}
				if(i+j==n-1){
					s2+=a[i][j];
				}
			}
		}
		int sum=s1-s2;
		if(sum<0) {
			sum*=-1;
		}
		System.out.println(sum);
		sc.close();
	}

}
