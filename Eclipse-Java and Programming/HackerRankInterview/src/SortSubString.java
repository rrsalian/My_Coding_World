import java.util.Arrays;
import java.util.Scanner;

public class SortSubString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String s[]=new String [n];
	int a[]=new int[2*n];
	for(int i=0;i<n;i++) {
		//System.out.println("*****");
		s[i]=sc.next();
		a[2*i]=sc.nextInt();
		a[(2*i)+1]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		
		String temp1=s[i].substring(a[2*i],a[(2*i)+1]);
		char ar[]=temp1.toCharArray();
		Arrays.sort(ar);
		String temp2="";
		for(int j=0;j<ar.length;j++) {
			temp2+=ar[j];
		}
		//System.out.println(temp2);
		StringBuffer sb=new StringBuffer(temp2);
		
		System.out.println(s[i].replace(temp1, sb.reverse()));
	}
	
}
}
