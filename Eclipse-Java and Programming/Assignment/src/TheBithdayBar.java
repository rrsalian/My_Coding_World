import java.util.Scanner;
public class TheBithdayBar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int dm[]=new int [2];
		for(int i=0;i<2;i++) {
			dm[i]=sc.nextInt();
		}
		int count =0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<(dm[1]+i)&&j<n;j++) {
				sum+=ar[j];
			}
			if(sum==dm[0]) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
