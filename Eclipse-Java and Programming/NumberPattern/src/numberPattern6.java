import java.util.Scanner;
/*************************************************************************************

5
45
345
2345
12345
 
***************************************************************************************/
public class numberPattern6 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(n-i+j);
			}
			System.out.println();
		}
	}
}
