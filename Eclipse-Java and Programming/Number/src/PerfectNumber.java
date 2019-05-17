import java.util.Scanner;
public class PerfectNumber {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int n=num;
	int sum=0;
	for(int i=1;i<=num/2;i++) {
		 if(n%i==0) {
			 sum+=i;
		 }
	}
	if(sum==num) {
		System.out.println("Perfect Number");
	}
	else {
		System.out.println("Not a Perfect Number");
	}
}
}
/*  1>   6 is devided by 1,2,3,
 *     1+2+3=6 It a Perpect Number
 *
 *  2> 28 is a perfect Number 1 + 2 + 4 + 7 + 14 = 28
 */
