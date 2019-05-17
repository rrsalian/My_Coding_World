import java.util.Scanner;

public class EmazeIn {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int a=0;
	int b=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='L') {
			a++;
		}
		else if(s.charAt(i)=='R') {
			a--;
		}
		else if(s.charAt(i)=='U') {
			b++;
		}
		else if(s.charAt(i)=='D') {
			b--;
		}
	}
	System.out.println(a+" "+b);
	sc.close();
}	
}
