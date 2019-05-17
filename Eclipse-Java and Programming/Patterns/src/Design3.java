import java.util.Scanner;
/*
  
         *
        ***
       *****
      *******
     *********
    ***********
   ** *  *  * **
  ***  * * *  ***
 ****   ***   ****
*******************
 ****   ***   ****
  ***  * * *  ***
   ** *  *  * **
    **   *   **
     **********
      *******
       *****
        ***
         *
    
 */



public class Design3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
					System.out.print(" ");
			}
			for(int j=0;j<n-i-1;j++)
			{
					System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
					System.out.print("*");
			}
			for(int j=0;j<=i;j++)
			{
					System.out.print("*");
			}
			
			System.out.println();
		}
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
			for(int j=0;j<=i;j++)
			{
				if(i==n-1||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n-i-1;j++)
			{
				if(i==0||j==n-i-2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n-i-1;j++)
			{
				if(j==n-i-2||i==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<=i;j++)
			{
				if(i==n-1||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<i;j++)
			{
					System.out.print("*");
			}
			
			
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n-i-1;j++)
			{
				if(j==n-i-2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<=i;j++)
			{
				if(i==n-1||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<=i;j++)
			{
				if(i==n-1||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n-i-1;j++)
			{
				if(j==n-i-2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n-i-2;j++)
			{
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n-i-1;j++) {
				System.out.print("*");
			}
			for(int j=0;j<n-i-2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
