package rakshith;

class Aq{
	
	int i=10;
	int j=20;
	
	void disp(){
		
		System.out.println("Hi");
	}
	
}

class B extends Aq {
	int i=19;
	int j=29;
	
	void disp(int a){
		this.j=60;
		
		System.out.println("Hello");
	}
	void disp() {
		this.j=55;
		System.out.println("Bye");
	}
}

public class neww123 {

	public static void main(String[] args) {
		
		Aq b;
		b=new Aq();
		
		b.disp();
		System.out.println(b.i+" "+b.j);
		b=new B();
		
		b.disp();
		System.out.println(b.i+" "+b.j);
		B d=new B();
		System.out.println(d.i+" "+d.j);
	
		
		

	}

}
