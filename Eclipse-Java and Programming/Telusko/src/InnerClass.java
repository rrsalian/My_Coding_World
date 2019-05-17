class Outer{
	Outer(){
		System.out.println("this is Outer constructor");
	}
	
	static int a;
	int b;
	int show() {
		System.out.println(a);
		return 1;
	}
	
	//NonStatic_Inner nst=new NonStatic_Inner(); //Possible
	
	
	// Member Class  or  Non-Static Inner Class 
	class NonStatic_Inner{
		NonStatic_Inner(){
			System.out.println("this is nonstatic Inner construcotr");
		}
		void show() {
			System.out.println(a);
			System.out.println(b);
			System.out.println("Nonstatic inner class");
		}
	}
	
	//Static Inner Class
	static class Static_Inner {
		Static_Inner(){
			System.out.println("this is static Inner Constructor");
		}
		void show() {
			System.out.println(a);
			//System.out.println(b); // Can't be accessed 
			System.out.println("Static inner class show() method");
		}
	}
	
}
public class InnerClass {
	public static void main(String[] args) {
		
		Outer out=new Outer();
		
		//Creation of object of Outer Class is Mandatory in case of Non-static Inner Class
		Outer.NonStatic_Inner nonsInner= out.new NonStatic_Inner();
		
		//Outer class object is non Mandatory to create Static-Inner Class Object
		Outer.Static_Inner statInner=new Outer.Static_Inner();
		
		nonsInner.show();
		statInner.show();
		
		///Static_Inner s=new Static_Inner(); //Not possible
		
		
	}

}
