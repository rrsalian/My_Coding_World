import java.util.Scanner;
/**********************************************
  
 Input  --> t1h5is i2s3 m2y f1i2s1t c2las3s
 Output --> this6 is5 my2 fist4 class5
  
**********************************************/
public class ScaleInaputOutut {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		String temp="";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122)) 
				{
					temp+=s.charAt(i);
					
				}
				else if(s.charAt(i)>=48&&s.charAt(i)<=57)
				{
					sum+=s.charAt(i)-48;
				}
				
			}
			else
			{
				temp+=sum+" ";
				sum=0;
			}
		}
		System.out.println(temp+sum);
	}

}