
public class WrapperClass {
	public static void main(String[] args) {
		int i=10;
		
		Integer ii=new Integer(i); //Boxing /wrapping
		//Putting primitive data into object is called as Boxing or Wrapping
		System.out.println(ii);
		
		int j=ii.intValue();  //UnBoxing /Unwrapping
		// Get the data from object is call UnBoxing
		System.out.println(j);
		
		Integer k=i; //AutoBoxing / AutoWrapping
		
		int l=k; //Auto UnBoxing / AutoUnWrapping
		
		//Primitive are faster than Wrapper Class
		
		
		
		
		String s="1243";
		int m=Integer.parseInt(s);
		System.out.println(m);
		
		
	}

}
