import java.util.Scanner;
/*************************************************************************************

54321
5432
543
54
5
 
***************************************************************************************/
public class numberPattern4 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
