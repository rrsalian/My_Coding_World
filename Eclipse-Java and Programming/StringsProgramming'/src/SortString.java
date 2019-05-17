import java.util.Scanner;
/************************************************

Input  -->  hgfedcba
Output -->  abcdefgh

**************************************************/
class SortString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] arr=s.toCharArray();
		String temp="";
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			temp+=arr[i];
		}
		System.out.println(temp);
	}

}
