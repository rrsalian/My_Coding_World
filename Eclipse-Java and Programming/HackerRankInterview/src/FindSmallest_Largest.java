import java.util.Arrays;
import java.util.HashSet;

public class FindSmallest_Largest {

	public static void main(String[] args) {
		
		int []a= {4,5,60,-3,6,60,-44,5-6,-44,4,5,7};
		
		//////////////////////////////////////////////////////////
		
		int small=Integer.MAX_VALUE;
		int large=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>large) {
				large=a[i];
			}
			if(a[i]<small) {
				small=a[i];
			}
		}
		
		System.out.println("small="+small+" large="+large);
		
		////////////////////////////////////////////////////////////
		
		Arrays.sort(a);
		
		System.out.println(a[0]+" "+a[a.length-1]);
		
		
		//////////////////////////////////////////////////////////////
		// Find out First and Second smallest  & Largest
		
		
		Arrays.sort(a);
		HashSet <Integer>s=new HashSet<>();
		
		for(int i:a) {
			s.add(i);
		}
		
		System.out.println(s.toString());
		
		Object b[]=s.toArray();
		Arrays.sort(b);
		
		System.out.println("First smallest="+b[0]+"     Second smallest="+b[1]);
		System.out.println("Fist Largest="+b[b.length-1]+"       Second Largest="+b[b.length-2]);
		
		

		
		
		
		
		
		
		
	}

}
