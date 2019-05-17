import java.util.Scanner;
public class FindFirstAndSecondLargestInArray {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the elenents");
		for(int i=0;i<n;i++) {
		ar[i]=sc.nextInt();
		}
		int fl=0;
		int sl=0;
		for(int i=0;i<n;i++) {
			if(ar[i]>fl) {
				sl=fl;
				fl=ar[i];
			}
			else if(ar[i]>sl && ar[i]!=fl) {
				sl=ar[i];
			}
		}
		System.out.println("The First Largest is: "+fl);
		System.out.println("The Second Largest is: "+sl);
	}
}
