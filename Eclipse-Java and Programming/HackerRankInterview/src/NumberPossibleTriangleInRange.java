import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberPossibleTriangleInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3};
		
		
		triangle(a);

	}
	
	public static void triangle(int a[]) {
		int sum=0;
		if(a.length<3) {
			System.out.println("not possible");
			System.exit(0);
		}
		Arrays.sort(a);
		
//		for(int i=0;i<a.length;i++) {
//			
//			int k=i;
//			for(int j=i;j<a.length;j++) {
//				while(k<a.length && a[i]+a[j]>a[k] ) {
//					System.out.println(a[i]+" "+a[j]+" "+a[k]);
//					k++;
//				}
//				
//				sum+=k-j;
//			}
//		}
		
		for(int i=0;i<a.length-2;i++) {
			if(a[i]+a[i+1]>a[i+2]) {
				sum++;
			}
		}
		
		System.out.println(sum);
		
		
	}

}
