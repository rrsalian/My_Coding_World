import java.util.Scanner;
/*************************************************************************************

12345
4321
123
21
1

 ***************************************************************************************/
public class numberPattern13 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				if(i%2==0) {
					System.out.print(n-j+1);
				}
				else {
					System.out.print(j-i);
				}
			}
			System.out.println();
		}
	}
}
