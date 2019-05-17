import java.util.Scanner;
/***********************************************

Input  -->this is my class
Output -->this 
          is 
          my 
          class

************************************************/
public class StringTypeArray {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String s=sc.nextLine();
	int count=0;
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)==' '&&s.charAt(i+1)!=' '){
			count++;
		}
	}
	String[] a=new String [count+1];
	int j=0;
	String temp="";
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
	a[j]=temp;
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
 }
}
