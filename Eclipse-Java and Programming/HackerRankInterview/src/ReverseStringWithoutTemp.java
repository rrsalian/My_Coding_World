
public class ReverseStringWithoutTemp {

	public static void main(String[] args) {
		
		String s="qwertyu";
		
		char a[]=s.toCharArray();
		for(int i=0;i<a.length/2;i++) {
			
			a[i]^=a[a.length-i-1];
			a[a.length-i-1]^=a[i];
			a[i]^=a[a.length-i-1];
			
		
		}
		
		s=new String(a);
		System.out.println(s);

	}

}
