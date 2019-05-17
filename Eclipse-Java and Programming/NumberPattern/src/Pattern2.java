import java.util.Scanner;
/*******************************************************************************

Enter n
4
1 * 2 * 3 * 4 * 17 * 18 * 19 * 20
    5 * 6 * 7 * 14 * 15 * 16
        8 * 9 * 12 * 13
            10 * 11

*********************************************************************************/
public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int k=1;
		int l=(n*n)+1;
	
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("    ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print(k++ );
				if(j<=n&&j>i) {
					System.out.print(" * ");
				}
			}
			System.out.print(" * ");
			//l=l-i;
			for(int j=n;j>=i;j--) {
				System.out.print(l++ );
				if(j<=n&&j>i) {
					System.out.print(" * ");
				}
			}
			l=l-(7-(2*(i-1)));
			System.out.println();
		}
	}
}
