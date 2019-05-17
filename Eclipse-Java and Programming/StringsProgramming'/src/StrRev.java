import java.util.Scanner;
/***************************************************

Input  --> this is my class
Output --> ssalc ym si siht

******************************************************/
public class StrRev{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String temp="";
		char []arr=s.toCharArray();
		for(int i=0;i<s.length()/2;i++)
		{
				char t=arr[i];
				arr[i]=arr[arr.length-1-i];
				arr[arr.length-1-i]=t;
				
			
		}
		for(int i=0;i<arr.length;i++) {
			temp+=arr[i];
		}
		System.out.println(temp);
	}

}
