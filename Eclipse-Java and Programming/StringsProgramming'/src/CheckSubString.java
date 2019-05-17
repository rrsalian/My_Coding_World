import java.util.Scanner;
public class CheckSubString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String sub=sc.next();
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == sub.charAt(j)) {
				j++;
			} 
			else {
				j = 0;
			}
			if (j == sub.length()) {
				System.out.println("Sub String");
				return;
			}
		}
	}
}
