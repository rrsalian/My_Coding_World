class A{
	
	A(){
		System.out.println("this is the constructor of A");
		
	}
	void show() {
		System.out.println("this is show of A");
	}
	
}

class B extends A{
	B(){
		System.out.println("this is the constructor of B");
	}
	@Override
	void  show() {
		System.out.println("this is show of B");
	}
	
}
public class MethodOverriding {
	public static void main(String[] args) {
		A b=new B();
		b.show();
	}
}
