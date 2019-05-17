
public class OddFactorBetweenNumber {
	
	//Odd factor between two number is equal to perfect square between two number

	public static void main(String[] args) {

		int a=10;
		int b=23500;
		int count=0;

		for(int i=a;i<=b;i++) {

			for(int j=1;j*j<=i;j++) {
				
				if(j*j==i) {
					count++;
					System.out.print(i+" ");
					
				}

			}

		}
		System.out.println("\n"+count);

	}
}
