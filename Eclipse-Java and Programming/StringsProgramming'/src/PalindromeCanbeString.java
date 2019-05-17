import java.util.Scanner;

public class PalindromeCanbeString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		s=sort(s);
		int n=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				n++;
				i++;
			}
		}
		if(n==s.length()/2) {
			System.out.println("Can be a Palindrome");
		}
		else {
			System.out.println("Can't a Palindrome");
		}


	}
	public static String sort(String s) {
		String temp="";
		char  ar[]=s.toCharArray();
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					char t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}
		for(int i=0;i<ar.length;i++) {
			temp+=ar[i];
		}
		return temp;
	}
}
