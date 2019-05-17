package rakshith;

import java.util.Arrays;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		int b[]=new int[5];
		String a="dfghabcjkl";
		//System.out.println(Arrays.sort(a.toCharArray()));
		char ab[]=a.toCharArray();
		Arrays.sort(ab);
		System.out.println(new String(ab));
		
		int arr[]= {1,2,3,4,5,6,7};
		
		Collections.reverse(Arrays.asList(arr));
		for(int i :arr)
			System.out.print(i+" ");
		
	}
}