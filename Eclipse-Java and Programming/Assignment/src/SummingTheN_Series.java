import java.util.Scanner;

public class SummingTheN_Series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for (int i=0;i<a.length;i++) {
			long sum=0;
			for(long j=a[i];j>0;j--) {
				sum+= (j*j)-((j-1)*(j-1));
			}
			System.out.println(sum);
		}
	}

}
