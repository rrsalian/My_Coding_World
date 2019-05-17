import java.util.Scanner;
/***************************************************
 
Input  -->this is my class
Output -->this4 is2 my2 class5

**************************************************/
public class MergeWordWithLength {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String temp="";
		int count=0;
	
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				temp+=s.charAt(i);
				count++;
			}
			else if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
				temp+=count+" ";
				count=0;
				
			}
		}
		temp+=count;
		System.out.println(temp);
	}

}
