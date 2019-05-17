import java.util.Scanner;
/****************************************************************************************
 
Sample Input :
4 
73 
67 
38 
33
Sample Output :
75 
67 
40 
33
 
***************************************************************************************/
public class gradingStudent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(ar[i]>=38) {
				int t=ar[i];
				int c=t/5;
				c++;
				c=c*5;
				int temp=c-t;
				if(temp<=2) {
					System.out.println(c);
				}
				else {
					System.out.println(ar[i]);
				}	
			}
			else {
				System.out.println(ar[i]);
			}
		}
		sc.close();
	}
}
