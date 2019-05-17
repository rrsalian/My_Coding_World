package rakshith;

class Demoo{
	
	int a;
	
	//Static Block
	static{
		//can't access non-static variable inside a static-block
		//System.out.println(a);
		System.out.println("this is static block");
	}
	
	//Non-Static Block
	{
		System.out.println(a);
		System.out.println("this is non static block");
	}
	
	//Constructor
	Demoo(){
		//super();  call the Object class constructor i.e it's parent class constructor
		//, to initialize Data members
		System.out.println("Inside the constructor");
	}
}

public class New9 {
	public static void main(String[] args) {
		Demoo d=new Demoo();
	}

}
