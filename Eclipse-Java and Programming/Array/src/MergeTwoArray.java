import java.util.Scanner;
/**************************************************************************************
 * 
 *
 
Enter the Firt Array Size
4
Enter the Second Array Size
5
Enter the First Array
1
2
3
4
Enter the Second Array
9
8
7
4
5
The Merged Array
1 2 3 4 9 8 7 4 5 
 
 *
 */
public class MergeTwoArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Firt Array Size");
		int n1=sc.nextInt();
		int ar1[]=new int[n1];
		System.out.println("Enter the Second Array Size");
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
		for(int i=0;i<n1;i++) {
			ar3[j]=ar1[i];
			j++;
		}
		for(int i=0;i<n2;i++) {
			ar3[j]=ar2[i];
			j++;
		}
		System.out.println("The Merged Array");
		for(int i=0;i<ar3.length;i++) {
			System.out.print(ar3[i]+" ");
		}
	}

}
