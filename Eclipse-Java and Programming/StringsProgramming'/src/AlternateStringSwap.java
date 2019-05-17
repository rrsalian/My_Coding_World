import java.util.Scanner;
/*******************************************
 
Input -->  this is my first java class
Output--> class is first my java this

********************************************/
public class AlternateStringSwap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
				count++;
			}
		}
		String[] ar=new String [count+1];
		int j=0;
		String temp="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				temp+=s.charAt(i);
			}
			else if(s.charAt(i)==' '&&s.charAt(i+1)!=' '){
				ar[j]=temp;
				temp="";
				j++;
			}
		}
		ar[j]=temp;
		temp="";
		for(int i=0;i<ar.length/2;i++) {
			String t=ar[i];
			ar[i]=ar[ar.length-i-1];
			ar[ar.length-1-i]=t;
			i++;
		}
	for(int i=0;i<ar.length-1;i++) {
		temp+=ar[i]+" ";
	}
	temp+=ar[ar.length-1];
	System.out.println(temp);
	}

}
