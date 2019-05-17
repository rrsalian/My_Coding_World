import java.util.Scanner;
/*******************************************************************************
 
 Enter n
6
1 * 2 * 3 * 4 * 5 * 6
13 * 14 * 15 * 16 * 17 * 18
25 * 26 * 27 * 28 * 29 * 30
31 * 32 * 33 * 34 * 35 * 36
19 * 20 * 21 * 22 * 23 * 24
7 * 8 * 9 * 10 * 11 * 12
 
********************************************************************************/
public class Pattern8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int k=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(j==0) {
					System.out.println("1");
				}
				else if(j==i) {
					System.out.println("1");
				}
				else {
					System.out.println(i*j);
				}
			}
		}

	}
}
