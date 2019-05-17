import java.util.Scanner;
/*************************************************************************************

11111
2222
333
44
5
 
***************************************************************************************/
public class numberPattern12 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
}
