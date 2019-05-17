import java.util.Scanner;
public class StrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int n=num;
	int sum=0;
	while(n!=0) {
		int t=0;
		t=n%10;
		sum+=factorial(t);
		n=n/10;
	}
	if(num==sum) {
		System.out.println("Strong Number");
	}
	else {
		System.out.println("Not a Strong Number");
	}
}
static int factorial(int t) {
	int f=1;
	for(int i=1;i<=t;i++) {
		f*=i;
	}
	return f;
}
}

/*
  
 145 -->  1! + 4! + 5! = 1 + 24 + 120 = 145 ,So 145 isa Strong number 
 
  
 */
