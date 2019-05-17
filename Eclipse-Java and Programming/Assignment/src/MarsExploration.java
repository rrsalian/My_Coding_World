import java.util.Scanner;
/********************************************************************************************

Sample Input :
SOSSPSSQSSOR

Sample Output :
3

Explanation :

Expected signal: SOSSOSSOSSOS
Received signal: SOSSPSSQSSOR
Difference:          X  X   X
We print the number of changed letters.

********************************************************************************************/
class MarsExploration {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();  //Enter the Input In Uppercase
		int count=0;         
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='S')
			{
				count++;
			}
			if(s.charAt(i+1)!='O')
			{
				count++;
			}
			if(s.charAt(i+2)!='S')
			{
				count++;
			}
			i=i+2;
			
		} 
		System.out.println(count);
		sc.close();
	}

}
