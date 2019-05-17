	import java.util.Scanner;
/*************************************************************

Input  --> this is my clsaa
Output --> This Is My Clsaa

***************************************************************/

public class WordFirstCharUp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String temp="";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
			count++;
		}
	}
	String ar[]=new String[count+1];
	int j=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ') {
			temp+=s.charAt(i);
		}
		else if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
			ar[j]=temp;
			j++;
			temp="";
		}
	}
	ar[j]=temp;
	temp="";
	for(int i=0;i<ar.length-1;i++) {
		temp+=conversion(ar[i])+" ";
	}
	temp+=conversion(ar[ar.length-1]);
	System.out.println(temp);
}
public static String conversion(String s) {
	String temp="";
	if(s.charAt(0)>=97&&s.charAt(0)<=122) {
		temp+=(char)(s.charAt(0)-32);
	}
	else {
		temp+=s.charAt(0);
	}
	for(int i=1;i<s.length();i++) {
		if(s.charAt(i)>=65&&s.charAt(i)<=90) {
			temp+=(char)(s.charAt(i)+32);
		}
		else {
			temp+=s.charAt(i);
		}
	}
	return temp;
}
}
