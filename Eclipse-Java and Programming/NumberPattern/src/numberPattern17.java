import java.util.Scanner;
/*************************************************************************************

1
2 4
1 3 5
2 4 6 8
1 3 5 7 9
 
***************************************************************************************/
public class numberPattern17 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j=j+1) 
			{
				
				System.out.print(j+i +" ");
			}
			System.out.println();
		}
	}
}
