import java.util.Scanner;
/**************************************************************************
 
               ANAGRAM
---------------------------------------
Mother in law
Hitler Woman
---------------------------------------
Peek
KE Ep
----------------------------------------
******************************************************************************/
class Anagram {
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String1");
			String s1=sc.nextLine();
			System.out.println("Enter the String2");
			String s2=sc.nextLine();
			s1=removeSpace(s1);
			s2=removeSpace(s2);
			boolean a=true;
			if(s1.length()==s2.length())
			{
				s1=lowerCase(s1);
				s2=lowerCase(s2);
				s1=sort(s1);
				s2=sort(s2);
				for(int i=0;i<s1.length();i++)
				{
					if(s1.charAt(i)!=s2.charAt(i))
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
				System.out.println("*Not Anagram");
			}
		}  //main ends
		
			//Method to remove the spaces in the string
			static String removeSpace(String s)
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
			static String lowerCase(String s)
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
 		static String sort(String s)
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