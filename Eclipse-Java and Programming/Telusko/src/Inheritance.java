class superClass{

	protected int a;
	void show() {
		System.out.println("super Class");
	}

}
class subClass extends superClass{
	
	subClass(){
		this(4);
		this.show();
		
		System.out.println("constructor");
	}
	subClass(int c){
		this.show();
		System.out.println("constructor");
	}
	
	int a;
	void show() {
		super.show();
		a=10;
		System.out.println(a);
		super.a=15;
		System.out.println(super.a);
		System.out.println("sub class");
	}

}
public class Inheritance {
	public static void main(String[] args) {
		subClass s=new subClass();
		//s.show();
	}
}

