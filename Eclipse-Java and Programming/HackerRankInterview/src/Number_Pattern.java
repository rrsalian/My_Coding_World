
public class Number_Pattern {
	public static void main(String[] args) {
		int n=3;
		int k=n*n;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==n-1) {
					System.out.print(k);
				}
				else {
				System.out.print(k+"*");
				}
				k--;
			}
			System.out.println();
		}
	}

}
