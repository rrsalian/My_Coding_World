import java.util.Scanner;
/********************************************************************************************

Sample Input :
11 #HackerRank
Sample Output :
1
Explanation :
 The password isn't strong, but she can make it strong by adding a single digit.
 
*********************************************************************************************/
class CipherString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner scn=new Scanner(System.in);
	    int l=sc.nextInt();                    //the length of the unencrypted string. 
	    String s=scn.nextLine();                 //unencrypted string, s.
	    int n=sc.nextInt();                     //the number of letters to rotate the alphabet by.
	    String temp="";
	    for(int i=0;i<l;i++) {
	    	char ch=s.charAt(i);
	    	if((ch>='a'&&ch<='z'))
	    	{
	            ch+=n;
	            if(ch>'z') 
	            {
	            	ch-='z'+1;
	            	ch+='a';
	            }
	           
	    		temp+=ch;
	    	}
	    	else if (ch>='A'&&ch<='Z')
	    	{ 
	    		 ch+=n;
	    		 if(ch>'Z') 
	    		 {
		            	ch-='Z'+1;
		            	ch+='A';
		         }
	    		 temp+=ch;
	    	}
	    	else if (ch>='0'&&ch<='9')
	    	{ 
	    		 ch+=n;
	    		 if(ch>'9') 
	    		 {
		            	ch-='9'+1;
		            	ch+='0';
		         }
	    		 temp+=ch;
	    	}
	    	
	    	else 
	    	{
	    		temp+=ch;
	    	}
	    }
	    System.out.println(temp);
	    sc.close();
	    scn.close();
	}

}
