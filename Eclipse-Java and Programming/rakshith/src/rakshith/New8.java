package rakshith;

class Operatioin{
	void add() {
		System.out.println("....");
	}
	void add(int a) {
		System.out.println(a);
	}
//	void add(int a,int b) {
//		System.out.println(a+b);
//	}
	void add(double a,int b) {
		System.out.println(a+b);
	}
	void add(int a,double b) {
		System.out.println(a+b +"fghj");
	}
//	void add(double a,double b) {
//		System.out.println(a+b);
//	}
	
}


public class New8 {
	public static void main(String[] args) {
		Operatioin op=new Operatioin();
		op.add(5,6.0);
	}

}
