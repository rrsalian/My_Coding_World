package Problem;
import java.util.Scanner;
/**************************************************************************

INPUT :
7
1    4    2  10  14    30    3
10 

OUTPUT:
3

EXPLANATION:	the first input N will be the size of the array
			the next N integers will be the elements of the array.
			The last input will be the key element  element to be serched.

			The output should be the index  of the key element present, if the 
			key element is not present in the array then it has to print -1.


 **************************************************************************/

public class Array12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int index=-1;
		for(int i=0;i<n;i++) {
			if(key==ar[i]) {
				index=i;
			}
		}
		System.out.println(index);

	}
}
