import java.util.Scanner;
public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int k=1;
		for(int i=0;i<n;i++) {
			int l=k;
			for(int j=1;j<=n;j++) {
				System.out.print(l);
				if(j>=0&&j<n) {
					System.out.print(" * ");
				}
				l=l+n;
			}
			k++;
			System.out.println();
		}

	}
}
