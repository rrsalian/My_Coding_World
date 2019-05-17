import java.util.*;
/*******************************************************************************************
 
Sample Input :
3
Ab1

Sample Output :
3

Explanation :
She can make the password strong by adding 3 characters, 
for example, $hk, turning the password into Ab1$hk which is strong.

2 characters aren't enough since the length must be at least 6.
 
********************************************************************************************/
 class Pswrd {
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		char ch;
		boolean up=false;
		boolean low=false;
		boolean num=false;
		boolean spcl=false;

	
		for(int i=0;i<n;i++) {
			ch=s.charAt(i);
			if(ch>='a'&&ch<='z') {
				low=true;
			}
			else if(ch>='A'&&ch<='Z'){
				up=true;
			}
			else if(ch>='0'&&ch<='9'){
				num=true;
			}
			else if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='*'||ch=='('||ch==')'||ch=='%'||ch=='?'||ch=='^'||ch=='-'||ch=='='||ch=='+') {
				
				spcl=true;
			}
			
		}
		int temp=0;
		if(up==true) {
			temp++;
		}
		if(low==true) {
			temp++;
		}
		if(num==true) {
			temp++;
		}
		if(spcl==true) {
			temp++;
		}
		if(n>=6)
		{
			 if(temp==4) 
			 {
				System.out.println("0");
			 }
			 else 
			 {
				System.out.println(4-temp );
			 }
		 }
		else 
		{
			if(temp==4) 
			 {
				System.out.println(6-n );
			 }
			else if(n==1) 
			 {
				System.out.println("5");
			 }
			else if(temp==2&&n==2||(temp==1&&n==2)) 
			 {
				System.out.println("4");
			 }
			else if(temp==1||temp==2&&n==3||(temp==3&&n==3)) 
			 {
				System.out.println("3");
			 }
			else if((temp==2&&n==5)||(temp==2&&n==4)||(temp==3&&n==4)||(temp==1&&n==2)||(temp==2&&n==2)||(temp==1&&n==1))
			 {
				System.out.println("2");
			 }
			
			else if(temp==3&&n==5)
			 {
				System.out.println("1");
			 }
		}
		sc.close();
	}
}
