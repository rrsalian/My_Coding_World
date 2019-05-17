import java.util.Scanner;
/************************************************

Input  -->this is my class
OutPut -->siht si ym ssalc

*************************************************/
public class ReverseWordsStringTypeArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String temp="";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
		{
			count++;
		}
	}
	String[] a=new String[count+1];
	int j=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
		{
			temp+=s.charAt(i);
		}
		else if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
		{
			a[j]=temp;
			j++;
			temp="";
		}
	}
	a[j]=temp;
	temp="";
	for(int i=0;i<a.length-1;i++)
	{
		temp+=reverse(a[i])+" ";
	}
	temp+=reverse(a[a.length-1]);
	System.out.println(temp);
}
public static String reverse (String s)
{
	String temp="";
	for(int i=s.length()-1;i>=0;i--)
	{
		temp+=s.charAt(i);
	}
	return temp;
}
}
