import java.util.Scanner;
/*************************************************************************************

55555
4444
333
22
1
 
***************************************************************************************/
public class numberPattern11 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(n-i);
			}
			System.out.println();
		}
	}
}
