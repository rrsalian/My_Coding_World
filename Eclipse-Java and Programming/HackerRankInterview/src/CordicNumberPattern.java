import java.util.Scanner;

public class CordicNumberPattern {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=0;
		for(int i=1;i<=n;i++) {
			l+=i;
		}
        
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-1-i;j++) {
				System.out.print("  ");
			}
			
			for(int k=0;k<i+1;k++) {
				if(l<10) {
					System.out.print("0");
				}
				System.out.print((l--));
				if(k<i) {
					System.out.print("__");
				}
			}

			System.out.println();
		}

	}

}
