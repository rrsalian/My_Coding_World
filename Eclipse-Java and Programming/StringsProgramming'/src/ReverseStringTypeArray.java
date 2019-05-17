import java.util.Scanner;
/*****************************************

Input  --> this is my class
Output --> class my is this

******************************************/
public class ReverseStringTypeArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int count=0;
	String temp="";
	s=trim(s);
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
		{
			count++;
		}
	}
	int j=0;
	String a[]=new String[count+1];
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
		{
			temp+=s.charAt(i);
		}
		else if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
		{
			a[j]=temp+' ';
			j++;
			temp="";
		}
	}
	a[j]=temp+' ';
	temp="";
	for(int i=a.length-1;i>=0;i--)
	{
		temp+=a[i];
	}
	System.out.println(temp); 
	
}
public static String trim(String s)
{
	int st=0;
	int ed=0;
	String temp="";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
		{
			st=i;
		    break;
		}
	}
	for(int i=s.length()-1;i>=0;i--)
	{
		if(s.charAt(i)!=' ')
		{
			ed=i;
		    break;
		}
	}
	for(int i=st; i<=ed;i++)
	{
		temp+=s.charAt(i);
	}
	return temp;
	
}
}
