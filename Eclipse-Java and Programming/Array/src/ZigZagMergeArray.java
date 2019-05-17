import java.util.Scanner;
/***********************************************************************************
 * 
INPUT:
Enter the First array size
5
Enter the Second array size
3
Enter the First Array
1
2
3
4
5
Enter the Second Array
6
7
8
OUTPUT:
1 6 2 7 3 8 4 5 
 
****************************************************************************************/
public class ZigZagMergeArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First array size");
		int n1=sc.nextInt();
		int ar1[]=new int[n1];
		System.out.println("Enter the Second array size");
		int n2=sc.nextInt();
		int ar2[]=new int[n2];
		System.out.println("Enter the First Array");
		for(int i=0;i<n1;i++) {
			ar1[i]=sc.nextInt();
		}
		System.out.println("Enter the Second Array");
		for(int i=0;i<n2;i++) {
			ar2[i]=sc.nextInt();
		}
		int ar3[]=new int[n1+n2];
		int j=0;
		
		int k=n1>n2?n1:n2;
		for(int i=0;i<k;i++) {
			if(i<n1) {
				ar3[j]=ar1[i];
				j++;
			}
			if(i<n2) {
				ar3[j]=ar2[i];
				j++;
			}
		}
		System.out.println("Output");
		for(int i=0;i<ar3.length;i++) {
			System.out.print(ar3[i]+" ");
		}
	}

}
