import java.util.Scanner;
 class Example {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
		int cnt=0;
		char[] ar=s.toCharArray();
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					char t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}
		for(int i=0;i<ar.length-1;i++)
		{
           if(ar[i]==ar[i+1])
              {
    	         cnt++;
    	         i++;
              }
		}
		if(cnt==ar.length/2)
		{
			System.out.println("it can be palindrome");
		}
		else
		{
		System.out.println("can not be");
	}
  }
}