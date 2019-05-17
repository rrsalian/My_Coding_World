import java.util.Scanner;
/*************************************************************************

Input  --> this is my class
Output --> siht is2 ym class5 

****************************************************************************/
class ReverseOddIndex {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String s=sc.nextLine();
	int count=0;
	for(int i=0;i<s.length();i++) {	
		if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
			count++;
		}
		}
	String a[]=new String[count+1];
	String temp="";
	int j=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ') {
			temp+=s.charAt(i);
		}
		else if(s.charAt(i)==' '&&s.charAt(i+1)!=' '){
			a[j]=temp;
			temp="";
			j++;
		}
	}
	a[a.length-1]=temp;
	temp="";
	for(int i=0;i<a.length;i++) {
		if(i%2==0) {
			temp+=reverse(a[i])+" ";
		}
		else {
			temp+=a[i]+a[i].length()+" ";
		}
	}
	System.out.println(temp);
	}
public static String reverse(String s) {
	String temp="";
	for(int i=s.length()-1;i>=0;i--) {
		 temp+=s.charAt(i);
	}
	return temp;
}
}
