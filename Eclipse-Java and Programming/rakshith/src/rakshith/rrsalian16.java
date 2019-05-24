package rakshith;

public class rrsalian16 {

	public static void main(String[] args) {
		int a[]= {31,12,73,41,55,34,11,45,88,99,6,2,4,7,2,4,7,8,2,4,6,7};

		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}


		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
