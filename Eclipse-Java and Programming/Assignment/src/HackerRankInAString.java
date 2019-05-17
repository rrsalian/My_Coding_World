import java.util.Scanner;
/******************************************************************************************
 
Sample Input :
2 
hereiamstackerrank 
hackerworld
Sample Output :
YES 
NO
Explanation :
We perform the following  queries:
1.  The string contains all the characters in hackerrank in the same exact order as they appear in hackerrank, we print YES .
2.  does not contain the last three characters of hackerrank, so we print NO .


********************************************************************************************/
class HackerRankInAString {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 	//the number of Strings
		String []a=new String[n]; //creating the n number of strings
	
		for(int i=0;i<n;i++) 
		{
			 a[i]=sc.next();  	//Storing n number of Strings
		}
		
		String hacker="hackerrank";  //sample 
		
		for(int i=0;i<n;i++)
		{
			int k=0;
			for(int j=0;j<a[i].length();j++)
			{
				if(a[i].charAt(j)==hacker.charAt(k)) 
				{
					k++;
					if(k>=10) 
					{
					break;
					}
				}
		  }
		 if(k==10) 
		 {
			 System.out.println("YES");  //if string contains character of"hackerrank"
			 
		 }
		 else 
		 {
			 System.out.println("NO");   //if string does not contains character of"hackerrank"
		 }
	 }
		sc.close();
	}
}
