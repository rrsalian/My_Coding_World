import java.util.Scanner;
/***************************************************************************
 * 

Sample Input:
          3
          abcdde
          baccd 
          eeabg
Sample Output:
          2
Explanation:
 Only a and b are gemstones because they are the only types that occur in every rock.
 
 ******************************************************************************/
public class Gemstones {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] a=new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
			a[i]=sort(a[i]);
			a[i]=removeDuplicate(a[i]);
		}
		int gemstone=0;
		for(char  i='a';i<='z';i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a[j].length();k++) {
					if(a[j].charAt(k)==i) {
					 count++;
					}
				}
			}
			if(count==n) {
				gemstone++;
			}
		}
		System.out.println(gemstone);
		sc.close();
		
	 }
	public static String sort(String s) {
		String temp="";
		char ar[]=s.toCharArray();
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ar[i]>ar[j]) {
					char t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}
		for(int i=0;i<ar.length;i++) {
			temp+=ar[i];
		}
		return temp;
	}
	public static String removeDuplicate(String s) {
		String temp="";
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)!=s.charAt(i+1)) {
				temp+=s.charAt(i);
			}
		}
		temp+=s.charAt(s.length()-1);
			return temp;
			
	}
}
