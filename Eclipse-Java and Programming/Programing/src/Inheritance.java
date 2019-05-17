import java.util.Scanner;
 class Demo {
	void disp1() {
		System.out.println("vijayanagar");
	}

}
class Demo1 extends Demo{
	void disp2() {
		System.out.println("BTM");
	}
}
class Demo2 extends Demo1{
	void disp3() {
		System.out.println("OAR");
	}
}
class Inheritance{
	public static void main(String[] args) {
		Demo2 d3=new Demo2();
		d3.disp1();
		d3.disp2();
		d3.disp3();
		
	}
}