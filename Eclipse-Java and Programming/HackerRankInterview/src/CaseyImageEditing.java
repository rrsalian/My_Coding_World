import java.util.Scanner;
/******************************************************************************

Input:
5             //rows
5            //Column

0 1 1 0 1

1 1 0 1 0

0 1 1 1 0

1 1 1 1 0

1 1 1 1 1

Output:
3  
           //size of maximum 1's square Matrix
1 1 1 
1 1 1 
1 1 1 

*******************************************************************************/
public class CaseyImageEditing {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //Number of Row 
		int m=sc.nextInt(); //Number of Column
		
		int arr[][]=new int[n][m];
		
		//Taking input of Matrix
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int count=0;
		int c=0;
		//Find the Size of Largest Matrix
		for (int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]==1 && arr[j][i]==1) {
					c++;
				}
				count=c>count?c:count;
			}
		}
		
		//Output the Size of Square Matrix
		count=(int) Math.sqrt(count);
		System.out.println(count);
		
		//Print the Largest Square Matrix
		for(int i=0;i<count;i++) {
			for(int j=0;j<count;j++) {
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
}
