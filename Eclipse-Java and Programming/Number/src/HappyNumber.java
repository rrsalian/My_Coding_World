import java.util.Scanner;
public class HappyNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int n=num;
	while(n>=6){  //Happy Number Start with 7 
		int sum=0;
		while(n!=0){   
			int temp=0;
			temp=n%10;
			sum+=(temp*temp);
			n=n/10;
		}
		n=sum;
	}
	if(n==1){
		System.out.println("Happy Number");
	}
	else {
		System.out.println("Not a Happy Number");
	}
}
}

/*

1>	For example, 19 is happy, as the associated sequence is
	sqare(1) + sqare(9) = 82,
	sqare(8) + sqare(2)= 68,
	sqare(6) + sqare(8) = 100,
	sqare(1) + sqare(0) + sqare(0) = 1.
	
2>  E.g. Consider 19
	sqare(1) + sqare(9) = 82
	sqare(8) + sqare(2) = 68
	sqare(6) + sqare(8) = 100
	sqare(1) + sqare(0) + sqare(0) = 1
	This shows that 19 is a happy number.	
 
 */