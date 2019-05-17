import java.io.IOException;
import java.util.Scanner;
/***********************************************************************************

https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

************************************************************************************/

public class BeautifulDaysAtTheMovies {

	// Complete the beautifulDays function below.
	static int beautifulDays(int i, int j, int k) {
		int count=0;
		for(int n=i;n<=j;n++) {
			int num=n;
			int revnum=0;
			int number=n;
			while(number!=0) {

				int rem=number%10;
				revnum=revnum*10+rem;
				number/=10;
			}
			count=((num-revnum)%k)==0?count+1:count;
		}
		return count;

	}

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String s=sc.nextLine();
		String a[]=s.split(" ");
		int i=Integer.parseInt(a[0]);
		int j=Integer.parseInt(a[1]);
		int k=Integer.parseInt(a[2]);

		int l=  beautifulDays(i,j,k);
		System.out.println(l);
	}
}
