import java.util.Scanner;
/********************************************************

Input  --> this is my class
Output --> this is my CLASS

**********************************************************/
public class LastWord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String temp="";
	char[] a=s.toCharArray();
	for(int i=s.length()-1;i>=0;i--)
	{
		if(s.charAt(i)!=' ') {
			a[i]=(char)(s.charAt(i)-32);
		
		}
		if(s.charAt(i)==' ')
			break;
	}
	for(int i=0;i<a.length;i++)
	{
		temp+=a[i];
	}
	System.out.println(temp);
}
}
