/***********************************************************
  
 Sum of odd factors of a number
 
 
 
Input : n = 30
Output : 24
Odd dividers sum 1 + 3 + 5 + 15 = 24 

Input : 18
Output : 13
Odd dividers sum 1 + 3 + 9 = 13

************************************************************/



public class SumOfOddFactorOfNumber {
	public static void main(String[] args) {
		int n=30 ;
		int sum=0;
		for(int i=1;i<n;i+=2) {
			
			if(n%i==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
