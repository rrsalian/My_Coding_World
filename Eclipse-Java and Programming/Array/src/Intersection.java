import java.util.Scanner;

public class Intersection {
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n1");
		int n1=sc.nextInt();
		int ar1[]=new int [n1];
		System.out.println("enter n2");
		int n2=sc.nextInt();
		int ar2[]=new int [n2];
		System.out.println("enter first Array");
		for(int i=0;i<n1;i++) {
			ar1[i]=sc.nextInt();
		}
		System.out.println("enter second Array");
		for(int i=0;i<n2;i++) {
			ar2[i]=sc.nextInt();
		}
		//Intersection
		int ar3[]=new int [n1];
		int k=0;
		for(int i=0;i<ar1.length;i++) 
		{
			for(int j=0;j<ar2.length;j++) 
			{
				if(ar1[i]==ar2[j])
				{
					ar3[k]=ar1[i];
					k++;
				}
			}
		}
		//sorting
		for(int i=0;i<n1;i++) {
			for(int j=i+1;i<n2-1;i++) {
				if(ar3[i]>ar3[j]) {
					int t=ar3[i];
					ar3[i]=ar3[j];
					ar3[j]=t;
				}
			}
		}
		//remove duplicate
		int ar4[]=new int [n1];
		int j=0;
		for(int i=0;i<ar3.length-1;i++) {
			if(ar3[i]!=ar3[i+1]) {
				ar4[j++]=ar3[i];
			}
		}
		ar4[j]=ar3[ar3.length-1];
		//Output
		System.out.println("elements are:");
		for(int i=0;i<=j;i++)
		{
			System.out.print(ar4[i]+" ");
		}
		
	}
}
