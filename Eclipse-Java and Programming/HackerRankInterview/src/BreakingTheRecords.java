import java.util.Scanner;

public class BreakingTheRecords {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int a[]=new int [n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int s=a[0];
	int l=a[0];
	int scnt=0;
	int lcnt=0;
	for(int i=1;i<n;i++) {
		if(a[i]>s) {
			s=a[i];
			scnt++;
		}
		if(a[i]<l) {
			l=a[i];
			lcnt++;
		}
	}
	System.out.print(scnt+" "+lcnt);
}
}
