import java.util.Scanner;
/*************************************************************************
                       ANAGRAM
 ***********************************************************
The Quick Brown Fox Jumps Over The Lazy Dog

*************************************************************
 ABCDEFGHIJKLMNOPQRSTUVWXYZ
 
****************************************************************************/
public class Panagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String temp="";
		s=removeUnwanted(s);
		if(s.length()>=26)
		{
			s=upperCase(s);
			s=sort(s);
			s=removeDuplicate(s);
			if(s.length()==26)
			{
				System.out.println("Panagram");
			}
			else
			{
				System.out.println("Not Panagram");
			}
		}
		else
		{
			System.out.println("Not Panagram");
		}
	}
	public static String removeUnwanted(String s)
	{
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65&&s.charAt(i)<=90 || s.charAt(i)>=97&&s.charAt(i)<=122)
			{
				temp+=s.charAt(i);
			}
		}
		return temp;
	}
	public static String upperCase(String s)
	{
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=97&&s.charAt(i)<=122)
			{
				temp+=(char)(s.charAt(i)-32);
			}
			else
			{
				temp+=s.charAt(i);
			}
		}
		return temp;
	}
	
	public static String sort(String s)
	{
		String temp="";
		char ar[]=s.toCharArray();
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					char t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			temp+=ar[i];
		}
		return temp;
	}
	public static String removeDuplicate(String s)
	{
		String temp="";
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)!=s.charAt(i+1))
			{
				temp+=s.charAt(i);
			}
		}
		temp+=s.charAt(s.length()-1);
		return temp;
	}
	

}
