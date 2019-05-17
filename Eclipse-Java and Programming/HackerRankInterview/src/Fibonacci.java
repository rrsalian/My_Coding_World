

import java.util.Scanner;

public class Fibonacci {
	
	//0 1 1 2 3 5 8 13 21 34

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		for(int i=0;i<n;i++) {
			int sum=a+b;
			
			if(sum>n) {
				break; //It will print fibanacci series till n only 
			}
			
			System.out.print(" "+sum);
			
			a=b;
			b=sum;
		}

	}


}
