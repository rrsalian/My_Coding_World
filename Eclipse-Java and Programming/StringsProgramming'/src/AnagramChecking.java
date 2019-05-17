
import java.util.Scanner;

public class AnagramChecking {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of String");
		int n=sc.nextInt();
		
		System.out.println("Enter the "+n+" Strings");
		String s[]=new String[n];
		String cp[]=new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			s[i]=sc.nextLine(); // n String inputs
			cp[i]=s[i];         //storing the copy of Strting
		}
	
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{  
				 boolean a=true;
				 System.out.println(cp[i]); //printing string 1
			     System.out.println(cp[j]); //printing string2
			     
				s[i]=removeSpace(s[i]);
			    s[j]=removeSpace(s[j]);
			if(s[i].length()==s[j].length())
			{
					s[i]=lowerCase(s[i]);
					s[j]=lowerCase(s[j]);
					s[i]=sort(s[i]);
					s[j]=sort(s[j]);
					for(int k=0;k<s[i].length();k++)
					{
						if(s[i].charAt(k)!=s[j].charAt(k))
						{
							System.out.println("Not Anagram");
							//return;
							a=false;
							break;
						}
					}
					if(a) {
					System.out.println("Anagram");
					}
				}
				else
				{
					System.out.println("Not Anagram");
				}
			System.out.println();
			}
		}
	
	}  
	//main ends
	
		//Method to remove the spaces in the string
	public	static String removeSpace(String s)
		{
			String temp="";
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)!=' ')
				{
					temp+=s.charAt(i);
				}
			}
			return temp;
		}
		
			//Methods to convert the lower case
	public	static String lowerCase(String s)
		{
			String temp="";
			for(int i=0;i<s.length();i++)
			{
			if(s.charAt(i)>=65&&s.charAt(i)<=90)
			{
				temp+=(char)(s.charAt(i)+32);
			}
			else 
			{
				temp+=s.charAt(i);
			}
			}
			return temp;
		}
		
			//Method to Sort the string
	public	static String sort(String s)
		{
			String temp="";
			char []ar=s.toCharArray();
			for(int i=0;i<ar.length-1;i++)
			{
				for(int j=i+1;j<ar.length;j++)
				{
					if(ar[i]>ar[j]) {
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
}
