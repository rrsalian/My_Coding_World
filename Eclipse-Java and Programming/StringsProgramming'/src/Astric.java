import java.util.Scanner;
/**************************************************************************
 
Input -->  this is my first java class
Output--> th*is *is my f*irst j*av*a cl*ass

**************************************************************************/

public class Astric {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String temp="";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
			temp+="*"+s.charAt(i);
		}
		else {
			temp+=s.charAt(i);
		}
	}
	System.out.println(temp);
}
}
