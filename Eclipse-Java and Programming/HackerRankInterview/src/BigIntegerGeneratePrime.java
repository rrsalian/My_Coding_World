import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerGeneratePrime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s="2476972353458794489521147118";
		//System.out.println(s.length());
		
		BigInteger b=new BigInteger(s);
		String c=b.toString();
		
		
		
		
		
		for(int i=0;i<=13;i++) {
			
			int sum=Character.getNumericValue(c.charAt(i))+Character.getNumericValue(c.charAt(c.length()-i-1));
			boolean f=true;
			for(int j=2;j<=sum/2;j++) {
				if(sum%j==0) {
					f=false;
					break;
				}
			}
			if(f=true) {
				
				System.out.print(sum+" ");
			}
		}

	}

}
