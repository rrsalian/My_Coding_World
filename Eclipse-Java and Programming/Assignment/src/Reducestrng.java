import java.util.Scanner;
/*******************************************************************************************

Sample Input :
aaabccddd

Sample Output :
abd

Explanation :

aaabccddd → abccddd → abddd → abd
 
********************************************************************************************/
public class Reducestrng {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer(sc.nextLine());
		for(int i=0;i<s.length()-1;i++) 
		{   
			if(s.charAt(i)==s.charAt(i+1)) 
			{    
				s.deleteCharAt(i);
				s.deleteCharAt(i);
				i=-1;
			}
		}
		if(s.length()==0) 
		{
			System.out.println("Empty String");
		}
		else
		{
			System.out.println(s);
		}
		sc.close();
	}
}
