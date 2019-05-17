package rakshith;

class Demo99{
	final int j;
	
	Demo99(){
		j=0;
		//this(1);
		System.out.println("hello");
	}
	Demo99(int a){
		this();
		System.out.println("hi");
	}
//If we write return type to a constructor it will become a method	
	
	int Demo99(int b) {
		System.out.println(b);
		return b;
	}
	
	
//for a method return type must be there
//  method() {
//		
//	}
}
public class New5 {
	public static void main(String[] args) {
		Demo99 d=new Demo99();
		new Demo99(2);
		System.out.println(d.Demo99(9));
	}

}
