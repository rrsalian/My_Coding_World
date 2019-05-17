package rakshith;


class Demo1{
	int a=10;
	void m1() {
		System.out.println("hello");
	}
	void m1(int i) {
		System.out.println("bye");
	}
	public int Demo1(int a) {
		return a;
	}
}


public class New6 extends Demo1 {
	int a=20;
	void m1() {
		System.out.println("biiiiii");
	}
	public static void main(String[] args) {
		Demo1 obj=new Demo1();
		obj.m1();
		System.out.println(obj.a);
		obj=new New6();
		System.out.println(obj.a);
		obj.m1();
		
		System.out.println(obj.Demo1(100));

	}
}
