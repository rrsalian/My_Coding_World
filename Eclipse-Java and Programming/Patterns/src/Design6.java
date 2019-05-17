import java.util.Scanner;
/*
  
     ****************          *          *
    ********* *  *  **        ***        **
   **********  **   ***      *****      ***
  ***********  **   ****    *******    ****
 ************ *  *  *****  *********  *****
*******************************************
*  
 */


public class Design6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
					System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
					System.out.print("*");
			}
			for(int j=0;j<=n;j++)
			{
					System.out.print("*");
			}
			for(int j=0;j<=n;j++)
			{
				if(i==j||j+i==n-1||i==0||i==n-1) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<=i;j++)
			{
					System.out.print("*");
			}
			for(int j=0;j<n-i-1;j++)
			{
					System.out.print(" ");
			}
			for(int j=0;j<n-i-1;j++)
			{
					System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
					System.out.print("*");
			}
			for(int j=0;j<i;j++)
			{
					System.out.print("*");
			}
			
			for(int j=0;j<n-i-1;j++)
			{
					System.out.print(" ");
			}
			for(int j=0;j<n-i-1;j++)
			{
					System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
