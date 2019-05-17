import java.util.Scanner;
/*************************************************************************************

1
01
101
0101
 
***************************************************************************************/
public class numberPattern15 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(i%2==0) {
				System.out.print((j+1)%2);
				}
				else {
					System.out.print(j%2);
				}
			}
			System.out.println();
		}
	}
}
