
@FunctionalInterface
interface Demo4{
	default void show() {
		System.out.println("Method inside Interface");
	}
	
	//We can overload the default void show method
	public default void show(int n) {
		System.out.println("Method inside Interface which is overloaded");
	}
	
	void print();
}


class asd implements Demo4{
	public void print() {
		System.out.println("print ");
	}
	
	//we can override the default show method
	public void show(int n) {
		System.out.println("Method inside Interface which is Overrided");
	}
	
	
	
}

public class InterfaceDefaultMethod {
	public static void main(String[] args) {
		Demo4 a=new asd();
		a.show();
		a.print();
		a.show(1);
	}

}
