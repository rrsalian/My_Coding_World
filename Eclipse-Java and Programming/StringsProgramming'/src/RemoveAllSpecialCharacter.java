import java.util.Scanner;
//remove all special character and numberfrom a give String
/**********************************************************
 
 Input  --> thi@s i!s my cla@ss
 Output --> thisismyclass
 
 ***********************************************************/
class RemoveAllSpecialCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122))
			{
				temp+=s.charAt(i);
			}

		}
		System.out.println(temp);
	}

}
