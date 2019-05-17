import java.util.*;
import java.lang.*;
import java.io.*;
class Burjalarab
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int odd=0;
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		if(s.length()%2!=0)
			odd=1;

		for(int i='a'; i<='z'; ++i)
		{
			int count=0;
			for(int j=0; j<s.length(); j++)
			{
				if(s.charAt(j)==i)
					count++;
			}
			if(count%2!=0)
			{
				if(odd<1)
				{
					System.out.printf("NO");
					System.exit(0);
				}
				else
					odd--;
			}
		}
		System.out.println("YES");
	}
}

