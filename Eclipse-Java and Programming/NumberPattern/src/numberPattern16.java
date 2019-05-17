import java.util.Scanner;
/*************************************************************************************

13579
3579
579
79
9
 
***************************************************************************************/
public class numberPattern16 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i=i+2) {
			for(int j=i;j<=n;j=j+2) 
			{
				
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
