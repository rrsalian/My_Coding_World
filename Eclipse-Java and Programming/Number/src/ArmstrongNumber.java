import java.util.Scanner;
public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int count=0;
	int n=num;
	while(n!=0){
		n=n/10;
		count++;
	}
	int sum=0;
	n=num;
	while(n!=0){
		int temp=0;
		temp=n%10;
		sum+=power(temp,count);
		n=n/10;
	}
	if(sum==num) {
		System.out.println("Amstrong Number");
	}
	else{
		System.out.println("Not a Amstrong Number");
	}
}
public static int power(int tm,int cnt)
{ 
	int p=1;
	while (cnt!=0){
		p*=tm;
		cnt--;
	}
	return(p);
}
}

/*

153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.

153 --> 1^3+5^3+3^3=153

371 Three digits 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371. Armstrong number.


*/