import java.util.Scanner;
class Count_VCNSS {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		int vc=0;  //vowel count
		int cc=0;  //consonate count
		int nc=0;  //number count
		int sp=0;  //space count  
		int sc=0;  //special character count
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65&&s.charAt(i)<=90||(s.charAt(i)>=97&&s.charAt(i)<=122))
					{
						if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'
								||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
						{
							vc++;
						}
						else 
						{
							cc++;
						}
					}
			else if(s.charAt(i)>=48&&s.charAt(i)<57)
			{
				nc++;
			}
			else if(s.charAt(i)==' ')
			{
				sp++;
			}
			else 
			{
				sc++;
			}
		}
		System.out.println("vowel count: "+vc);
		System.out.println("consonate count: "+cc);
		System.out.println("number count: "+nc);
		System.out.println("space count: "+sp);
		System.out.println("special character count: "+sc);
		
		
	}

}
