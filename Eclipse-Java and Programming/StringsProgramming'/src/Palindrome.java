
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String temp="";
		char[] a=s.toCharArray();
		for(int i=0;i<s.length()/2;i++)
		{
			if(a[i]!=a[a.length-1-i])
			{
				System.out.println("Not Palindrome");
				return ;
			}
			
		}
		System.out.println("Palindrome");
	}

}
