import java.util.Arrays;

public class SortArrayUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,4,67,34,55,12,1,4,5,27};
		int b[]=RecurseSort(a,a.length);
		System.out.println(Arrays.toString(b));
		
	}
	
	public static int[] RecurseSort(int a[],int n) {
		
		
		if(n<2) {
			return a;
		}
		
		for(int i=0;i<n-1;i++) {
			if(a[i]>a[i+1]) {
				int t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
		}
		
		RecurseSort(a,n-1);
		return a;
		
		
	}

}
