import java.util.Scanner;
public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				for(int j=0;j<=n;j++) {
					if(j==n) {
						System.out.print(i+1+" ");
					}
					else {
						System.out.print(i+" ");
					}
				}
				System.out.println();
			}
			else {
				for(int j=0;j<=n;j++) {
					if(j==0) {
						System.out.print(i+1+" ");
					}
					else {
						System.out.print(i+" ");
					}
				}
				System.out.println();
			}
		}
	}
}
