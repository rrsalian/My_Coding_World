import java.util.Scanner;
/*************************************************************************************

12345
2345
345
45
5
 
***************************************************************************************/
public class numberPattern2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(j+i);
			}
			System.out.println();
		}
	}
}
