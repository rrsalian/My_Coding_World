import java.util.Scanner;
/****************************************************************************
 
 Input --> this is my first class
Output --> classthis9 firstis7 my2

******************************************************************************/
public class SampleInputOutput_seccond {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
				count++;
			}
		}
		String ar[]=new String [count+1];
		int j=0;
		String temp="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				temp+=s.charAt(i);
			}
			else if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
				ar[j]=temp;
				temp="";
				j++;
			}
		}
		ar[ar.length-1]=temp;
		temp="";
		for(int i=0;i<ar.length/2;i++) {
			temp+=ar[ar.length-1-i]+ar[i]+(ar[i]+ar[ar.length-1-i]).length()+" ";
		}
		if(ar.length%2!=0) {
			temp+=ar[ar.length/2]+(ar[ar.length/2]).length();
		}
		System.out.println(temp);
	}

}
