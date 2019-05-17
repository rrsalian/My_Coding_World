import java.util.Scanner;
/********************************************************************************

Enter n
4
1
3 * 2
4 * 5 * 6
10 * 9 * 8 * 7


*********************************************************************************/
public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				for(int j=1;j<=i;j++) {
					System.out.print(k++ );
					if(j>=1&&j<i) {
						System.out.print(" * ");
					}
				}
				System.out.println();
			}
			else if(i%2==0) {
				k=k+(i-1);
				for(int j=1;j<=i;j++) {
					System.out.print(k--);
					if(j>=1&&j<i) {
						System.out.print(" * ");
					}
				}
				System.out.println();
				k=k+(i+1);
			}
		}
	}
}
