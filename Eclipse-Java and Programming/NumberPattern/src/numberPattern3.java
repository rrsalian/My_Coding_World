import java.util.Scanner;
/*************************************************************************************

54321
4321
321
21
1
 
***************************************************************************************/
public class numberPattern3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(j-i);
			}
			System.out.println();
		}
	}
}
