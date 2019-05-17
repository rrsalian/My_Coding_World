import java.util.Scanner;

public class TheMaximunSubarry {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[][]=new int[n][];
		for(int i=0;i<ar.length;i++) {
			int a=sc.nextInt();
			ar[i]=new int[a];
			for(int j=0;j<ar[i].length;j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<ar.length;i++) {
			subsets(ar[i]);
		}

	}

	public static void subsets(int arr[]) {
		int a[]=new int[(int)Math.pow((double)2 ,(double)arr.length)];
		//System.out.println("{ }");
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			//System.out.println("{ "+arr[i]+" }");
			sum=i>sum?i:sum;
			for (int j=i+1;j<arr.length;j++) {
				//System.out.println("{ "+arr[i]+" "+arr[j]+" }");
				//int a=arr[i]+arr[j]
			}
		}

	}



}
