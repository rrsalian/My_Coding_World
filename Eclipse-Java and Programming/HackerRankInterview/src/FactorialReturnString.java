import java.util.Scanner;

public class FactorialReturnString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		String s=fact(n);
		System.out.println(s);
	}
	
	public static String fact(int n) {
		
		int sum=1;
		if(n==1) {
			sum=1;
		}
		while(n>1) {
			sum*=n;
			n--;
		}
		
		//This is for convert the Integer Value to String
		String s=Integer.toString(sum);
		return s;
	}

}

