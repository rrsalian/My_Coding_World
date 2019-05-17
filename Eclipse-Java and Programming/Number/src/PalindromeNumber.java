import java.util.Scanner;
public class PalindromeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int n=num;
	int sum=0;
	while(n!=0) {
		int temp=0;
		temp=n%10;
		sum=sum*10+temp;
		n=n/10;
	}
	if(sum==num) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a Palindrome");
	}
}
}
