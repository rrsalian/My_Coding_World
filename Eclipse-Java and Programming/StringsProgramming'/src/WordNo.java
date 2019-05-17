import java.util.Scanner;
/*****************************************************************

Input  --> this is my class
Output --> no of words 4

*********************************************************************/
public class WordNo{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
				count++;
				
			}
		}
		System.out.println("no of words "+(count+1));
	}

}
