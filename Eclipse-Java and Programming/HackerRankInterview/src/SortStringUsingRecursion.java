import java.util.Arrays;
import java.util.Scanner;

public class SortStringUsingRecursion {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		String s=sc.nextLine();
		char b[]=RecurseSort(s.toCharArray(),s.length());
		System.out.println(new String(b));

	}

	public static char[] RecurseSort(char a[],int n) {


		if(n<2) {
			return a;
		}

		for(int i=0;i<n-1;i++) {

			if(a[i]>a[i+1]) {
				char t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
		}
		//System.out.println(new String(a));
		RecurseSort(a,n-1);
		return a;


	}

}
