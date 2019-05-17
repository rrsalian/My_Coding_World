import java.util.Scanner;

public class I_love_you {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			//I
			for(int j=0;j<n;j++)
			{
				if((i==0||i==n-1||j==n/2-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//_
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			//L
			for(int j=0;j<n;j++)
			{
				if((j==0 ) || (i==n-1)&&(j<n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//O
			for(int j=0;j<n;j++)
			{
				if((j==0||j==n-1)&&(i!=0&&i!=n-1) || (i==0||i==n-1)&&(j>0&&j<n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//V
			for(int j=0;j<n;j++)
			{
				if((i==j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)
			{
				if((i+j==n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//E
			
			for(int j=0;j<n;j++)
			{
				if(j==0 || (i==0||i==n/2||i==n-1)&&(j<n))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//_
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			//U
			for(int j=0;j<n;j++)
			{
				if((j==0 || j==n-1)&&(i!=n-1) || (i==n-1)&&(j>0&&j<n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}


}
