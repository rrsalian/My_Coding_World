import java.util.Scanner;

public class Apple_Orange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Home location
		int a[]=new int[2];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		//loaction of Apple and Orange Tree
		int b[]=new int[2];
		for (int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		//Number of Apple and Orange Tree From Tree
		int c[]=new int[2];
		for(int i=0;i<c.length;i++) {
			c[i]=sc.nextInt();
		}
		//Fall Apple Location
		int app[]=new int[c[0]];
		for(int i=0;i<app.length;i++) {
			app[i]=sc.nextInt();
		}
		int org[]=new int[c[1]];
		for (int i=0;i<org.length;i++) {
			org[i]=sc.nextInt();
		}

		int AppleCount=0;
		int OrangeCount=0;

		for (int i=0;i<app.length;i++) {
			int loc=b[0]+app[i];
			if( loc>=a[0] && loc<=a[1]) {
				AppleCount++;
			}
		}

		for (int i=0;i<org.length;i++) {
			int loc =b[1]+org[i];
			if( loc>=a[0] && loc<=a[1]) {
				OrangeCount++;
			}
		}
		System.out.println(AppleCount);
		System.out.println(OrangeCount);

	}
}
