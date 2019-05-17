import java.util.Arrays;
import java.util.Scanner;

public class FibnonacciOf_perticular_position {
	
	////0 1 1 2 3 5 8 13 21 34
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		System.out.println(fib(n));
		
		String s="asdfas";
		char c[]=s.toCharArray();
		Arrays.sort(c);
//		String sort=new String(c);
//		System.out.println(sort);
		
		
	}
	public static int fib(int n) {
		int result;
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			result=fib(n-1)+fib(n-2);
		}
		
		return result;
	}

}
