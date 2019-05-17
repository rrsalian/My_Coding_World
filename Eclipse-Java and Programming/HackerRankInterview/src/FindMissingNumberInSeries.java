import java.util.Arrays;

public class FindMissingNumberInSeries {

	public static void main(String[] args) {


		int a[]= {1,2,4,5,7,9};
		Arrays.sort(a);

		//		int count=0;
		//		int k=a[0];
		//
		//		for(int i=0;i<a.length;i++) {
		//			if(a[i]!=i+k) {
		//
		//				System.out.println(i+k);
		//				k++;
		//				i--;
		//			}
		//		}



		int count=0;
		int k=a[0];

		for(int i=a[0];i<a.length+a[0];i++) {

			//System.out.println(a[i-k]+"      "+(i+count)+"           "+i);

			if(a[i-k]!=i+count) {

				System.out.println(i+count);
				count++;
				i--;
			}
		}


	}

}
