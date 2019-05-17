import java.math.BigInteger;
import java.util.Scanner;

public class FactorialBigInteger {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		System.out.println(fact(n));
	}


	public static BigInteger fact(int n) {

		//String s=Integer.toString(n);
		BigInteger b=new BigInteger("1");
		for(int i=1;i<=n;i++) {
			b=b.multiply(new BigInteger(Integer.toString(i)));
		}

		return b;

	}

}
