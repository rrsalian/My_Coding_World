

import java.util.Scanner;
/****************************************************************************

 Collindrome

 input:
  pacpac
 ouput:
  colindrome


  input:
   collocmonnom
  output:
    colindrome


first 3 character should be palindrome of next 3 character


 ******************************************************************************/

public class Collindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.length()%6==0) {
			for(int i=0;i<s.length()-5;i+=6) {
				int k=0;
				int l=i+5;
				for(int j=i;j<i+3;j++){
					//System.out.println(j+" "+ (l-k));
					// System.out.println(s.charAt(j)+" "+s.charAt(l-k));
					if(s.charAt(j)!=s.charAt(l-k)) {
						System.out.println("NOt Colindrome");
						System.exit(0);
					}
					k++;
				}

			}
			System.out.println("colindrome");
		}
		else {
			System.out.println("Not colindrome");
		}
	}

}
