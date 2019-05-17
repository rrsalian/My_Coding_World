
public class PerfectSquare {
	
	//4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169,.....
	
	//Perfect Square Number is Number whose squareroot is whole integer.

	public static void main(String[] args) {
		
		
		int n=12;
		
		for(int i=1;i*i<=n;i++) {

			if((i*i)==n) {
				System.out.println("It is a Perfect Square Number");
				System.exit(0);
			}
		}
		System.out.println("It is NOT a Perfect Square Number");
	}

}
