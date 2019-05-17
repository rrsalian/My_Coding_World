import java.util.Arrays;
import java.util.Scanner;

public class CountNumberOfCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int count=1;
		Arrays.sort(a);

		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				count++;
			}
			else{
				System.out.println((a[i]+"="+count));
				count=1;
			}
		}
		System.out.println((a[a.length-1]+"="+count));
	}
}
