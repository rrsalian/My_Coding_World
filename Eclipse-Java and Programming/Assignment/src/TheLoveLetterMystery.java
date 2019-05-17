import java.util.Scanner;
/********************************************************************************************
Sample Input :
4 
abc 
abcba 
abcd 
cba
Sample Output :
2 
0 
4 
2
Explanation :
1. For the first test case, 
a b c → a b b → a b a .
2. For the second test case, 
a b c b a is already a palindromic string.
3. For the third test case, 
a b c d → a b c c → a b c b → a b c a → a b b a . 4. For the fourth test case, c b a → b b a → a b a .
**********************************************************************************************/
public class TheLoveLetterMystery {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Strings");
		int n=sc.nextInt();
		String a[]= new String[n];
		System.out.println("Enter the Strings");
		for(int i=0;i<n;i++) {
			a[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
			find(a[i]);
		}
		sc.close();
		}
	public static void find(String s) {
		
		int count=0;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				if(s.charAt(i)>s.charAt(s.length()-i-1)) {
				count+=s.charAt(i)-s.charAt(s.length()-i-1);
				}
				else {
					count+=s.charAt(s.length()-i-1)-s.charAt(i);
				}
			}
		}
		System.out.println(count);
	}

}
