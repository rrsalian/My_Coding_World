import java.util.Scanner;
/******************************************************************************************

Sample Input:
2
acxz
bcxz

Sample Output:
Funny
Not Funny

********************************************************************************************/
public class FunnyString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String a[]=new String[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.next();
	}
	for(int i=0;i<n;i++) {
		findFunny(a[i]);
	}
	sc.close();
}	
public static void findFunny(String s) {
	for(int i=0;i<s.length()-1;i++) {
		int a=0,b=0,c=0,d=0,e=0,f=0;
		a=s.charAt(i+1);
		b=s.charAt(i);
		e=a-b;
		if(e<0) {
			e*=-1;
		}
		c=s.charAt(s.length()-1-i-1);
		d=s.charAt(s.length()-1-i);
		f=c-d;
		if(f<0) {
			e*=-1;
		}
		if(e!=f) {
			System.out.println("Not Funny");
			return;
		}
	}
	System.out.println("Funny");
	
}
}
