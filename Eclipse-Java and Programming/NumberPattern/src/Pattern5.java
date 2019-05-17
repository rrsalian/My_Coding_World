import java.util.Scanner;
/********************************************************************************

Enter n
6
1 * 2 * 3 * 4 * 5 * 6
13 * 14 * 15 * 16 * 17 * 18
25 * 26 * 27 * 28 * 29 * 30
31 * 32 * 33 * 34 * 35 * 36
19 * 20 * 21 * 22 * 23 * 24
7 * 8 * 9 * 10 * 11 * 12

 */
public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int k=1;
		for(int i=0;i<((n+1)/2);i++) {
			for(int j=0;j<n;j++) {
				System.out.print(k++ );
				if(j>=0&&j<n-1) {
					System.out.print(" * ");
				}
			}
			k=k+n;
			System.out.println();
		}
		k=k-n;
		if(n%2==1) {
			k=k-(n*2);
		}
		for(int i=0;i<n/2;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(k++ );
				if(j>=0&&j<n-1) {
					System.out.print(" * ");
				}
			}
			if(n%2==1) {
				k=k-(n*(n-2));
			}
			else if(n%2==0){
				k=k-(n*3);
			}
			System.out.println();
		}
	}
}
