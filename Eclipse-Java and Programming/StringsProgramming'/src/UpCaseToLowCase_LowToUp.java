import java.util.Scanner;
/*******************************************************************

Input  --> this is my class
Output --> ssalc ym si siht

********************************************************************/
class UpCaseToLowCase_LowToUp 
{ 
	public static void main(String[] args) 
	{
		Scanner scn= new Scanner(System.in);
		String s=scn.nextLine();
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65&&s.charAt(i)<=90)
			{
				temp+=(char)(s.charAt(i)+32);
			}
			else if(s.charAt(i)>=97&&s.charAt(i)<=122)
			{
				temp+=(char)(s.charAt(i)-32); 
			}
			else
			{
				temp+=s.charAt(i);
			}
		}
		System.out.println(temp);
	}

}
