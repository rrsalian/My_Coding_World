import java.util.Scanner;

public class RangoliAlphabet {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=(n*3)-(n-3);
		int l=n/2;
		for(int i=0;i<2*n-1;i++) {
			for (int j=0;j<l;j++) {
				if(j<l) {
					System.out.print("=");
				}
			}
			l=l-3;
			System.out.println();
			
		}
	}

}
