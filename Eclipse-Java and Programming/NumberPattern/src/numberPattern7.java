import java.util.Scanner;
/*************************************************************************************

1
21
321
4321
54321
 
***************************************************************************************/
public class numberPattern7 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i-j);
			}
			System.out.println();
		}
	}
}
