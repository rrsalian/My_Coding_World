import java.util.Scanner;
//Remove the spaces in the Front and Back from the String
/********************************************************

Input  --> this is my class 
Output -->this is my class

***********************************************************/

public class RemoveSpaceInString {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		String s=sc.nextLine();
		String temp="";
		int st=0;
		int ed=0;
		//find the start of the string
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)!=' ') {
				st=i;
				break;
				
			}
		}
		//find the end of the string
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ') {
				ed=i;
				break;
			}
		}
		for(int i=st; i<=ed;i++)
		{
			temp+=s.charAt(i);
			
		}
		System.out.println(temp);
	}

}
