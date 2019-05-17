
public class Arrays {
	public static void main(String[] args) {
		int a[]=new int[4];

		//System.out.println(a[-1]); Error
		a[0]=33;
		a[3]=34;

		
		//Enhanced for-loop
		for(int i:a) {
		System.out.println(i);
		}
		


		int b[][]= {

				{1,2,3,4},
				{2,4,6,7},
				{6,8,9,0}
				
		};
		
		System.out.println(b[0][2]);
		
		
//		for (int[] i:b) {
//			for(int j:i)
//			 System.out.println(j);
//		}

	}
	

}
