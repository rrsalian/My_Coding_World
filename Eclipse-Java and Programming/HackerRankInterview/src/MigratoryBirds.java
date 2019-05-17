import java.util.Scanner;

public class MigratoryBirds {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int c1=0,c2=0,c3=0,c4=0,c5=0;
		for(int i=0;i<n;i++) {
			int k=a[i];
			if(a[i]==1) {
				c1++;
			}
			else if(a[i]==2) {
				c2++;
			}
			else if(a[i]==3) {
				c3++;
			}
			else if(a[i]==4) {
				c4++;
			}
			else if(a[i]==5) {
				c5++;
			}
		}
		if(c1>=c2&&c1>=c3&&c1>=c4&&c1>=c5) {
			System.out.println("1");
		}
		else if(c2>=c3&&c2>=c4&&c2>=c5) {
			System.out.println("2");
		}
		else if(c3>=c4&&c3>=c5) {
			System.out.println("3");
		}
		else if(c4>=c5) {
			System.out.println("4");
		}
		else {
			System.out.println("5");
		}

	}
}
