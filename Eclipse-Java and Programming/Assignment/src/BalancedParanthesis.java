import java.util.Scanner;
import java.util.Stack;
/***********************************************************************************
 
 a*(b+c)-(d*e) : Balanced
(a*(b-c)*{d+e} : Not Balanced

*************************************************************************************/

public class BalancedParanthesis {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();

		
		System.out.println(balance(s));

	}
	public static String balance(String s) {
		if(s.isEmpty()) {
			return "Balanced";
		}
		Stack<Character> st=new Stack<Character>();	
		for (int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='{' || c=='(' || c=='[' ) {
				st.push(c);
			}
			else if (c=='}' || c==')' || c==']') {
				if(st.isEmpty()) {
					return "UnBalance";
				}
				else if(c=='}' && st.peek()=='{' || c==')' && st.peek()=='(' || c==']' && st.peek()=='[' ) {
					st.pop();
				}
				else {
					System.out.println(c);
					return "Unbalance";
				}
			}
		}
		
		if(st.isEmpty()) {
		return "Balanced..";
		}
		else {
			return "Not Balanced";
		}
	}
}
