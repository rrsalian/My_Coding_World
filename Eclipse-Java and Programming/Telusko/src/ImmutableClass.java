


class LaunchImmutableClass{
	
	final int i;
	final int j;
	public LaunchImmutableClass(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public void get() {
		System.out.println(i);
		System.out.println(j);
	}
}
	
	
public class ImmutableClass {
	
	public static void main(String[] args) {
		LaunchImmutableClass a=new LaunchImmutableClass(3,5);
		
		a=new LaunchImmutableClass(5,9);
	}
	
	
}
