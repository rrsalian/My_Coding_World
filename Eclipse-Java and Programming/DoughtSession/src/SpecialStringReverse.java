import java.util.Scanner;
public class SpecialStringReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String temp="";
		char[] ar=s.toCharArray();
		int j=ar.length-1;
		for(int i=0;i<s.length()/2;i++) {
			if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122))
			{
				if((s.charAt(j-i)>=65&&s.charAt(j-i)<=90)||(s.charAt(j-i)>=97&&s.charAt(j-i)<=122))
				{
				   char t=ar[i];
				   ar[i]=ar[j-i];
				   ar[j-i]=t;
				}
			}
		  }
			for(int i=0;i<ar.length;i++)
			{
				temp+=ar[i];
			}
			System.out.println(temp);
	}
	
}
