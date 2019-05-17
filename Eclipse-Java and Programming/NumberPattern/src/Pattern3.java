import java.util.Scanner;
/********************************************************************************

Enter n
4
10  
9  8  
7  6  5  
4  3  2  1 

********************************************************************************/
public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int k=0;
		for(int i=0;i<n;i++) {
			k+=n-i;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(k-- +"  ");
			}
			System.out.println();
		}
	}
}
