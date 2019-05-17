import java.util.Scanner;

public class Union {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n1");
		int n1=sc.nextInt();
		int ar1[]=new int [n1];
		System.out.println("enter n2");
		int n2=sc.nextInt();
		int ar2[]=new int [n2];
		System.out.println("enter a");
		for(int i=0;i<n1;i++) {
			ar1[i]=sc.nextInt();
		}
		System.out.println("enter b");
		for(int i=0;i<n2;i++) {
			ar2[i]=sc.nextInt();
		}
		System.out.println("Output :");
		for(int i=0;i<ar1.length;i++) {
			System.out.print(ar1[i]+" ");
			}
		for(int i=0;i<ar2.length;i++) {
			boolean d=false;
			for(int j=0;j<ar1.length;j++) {
				if(ar2[i]==ar1[j]) {
					d=true;
				}
			}
			if(d==false) {
				System.out.print(ar2[i]+" ");
			}
		}
	}
}
