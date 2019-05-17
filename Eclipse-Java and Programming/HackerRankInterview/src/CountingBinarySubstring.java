import java.util.Scanner;

public class CountingBinarySubstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		int count=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)=='1' && s.charAt(i+1)=='0') {
				count++;
			}
		}
		for(int i=s.length()-1;i>0;i--) {
			if(s.charAt(i)=='1' && s.charAt(i-1)=='0') {
				count++;
			}
		}
		for(int i=0;i<s.length()-1;i++) {
			//
			
			
		}
		System.out.println(count);
	}
}
