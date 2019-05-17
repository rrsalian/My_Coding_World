import java.util.Scanner;
/*************************************************************************************

5
44
333
2222
11111
 
***************************************************************************************/
public class numberPattern10 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(n-i);
			}
			System.out.println();
		}
	}
}
