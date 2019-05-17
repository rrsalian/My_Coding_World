import java.util.Scanner;
/*********************************************

Input  -->  this is my class 
Output -->thisismyclass

**********************************************/

class RemoveExtraSpaces
	{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	    System.out.println("enter");
		String s=sc.nextLine();
		String temp="";
		
		for(int i=0;i<s.length();i++)
		{
             if(s.charAt(i)!=' '){
            	 temp+=s.charAt(i);
             }
             else if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
            	 temp+=s.charAt(i);
             }
		}
		System.out.println(temp);
	}

}
