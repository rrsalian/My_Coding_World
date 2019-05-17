import java.util.Scanner;
public class PrintLongestPalindromeInString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("Longest Palindromes :");
		String temp="";
		for(int i=0;i<=s.length();i++)
		{
			for(int j=0;j<i;j++)
			{
				String str=s.substring(j,i);
				if(str.length()>=2) {
					String s2=revStr(str);
					if(str.equals(s2))
					{
						if(str.length()>temp.length()) {
							temp=str;
						}
					}
				}
			}
		}
		System.out.println(temp);
	}
	public static String revStr(String t) {
		Scanner sc=new Scanner(System.in);
		String temp="";
		for(int i=t.length()-1;i>=0;i--) 
		{
			temp+=t.charAt(i);
		}
		return temp;
	}

}