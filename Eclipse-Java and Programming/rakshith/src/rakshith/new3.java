package rakshith;

class Dem{
	int f=10;
	Dem(int a,int b){
		this();
		//super();
		System.out.println("hi");
	}
	Dem(){
		super();
	}
	
	 void d() {
		 System.out.println("d");
	}
	 
   void d(int a) {
		System.out.println("d(int a)");
	}
  
  
}

class Dem1 extends Dem{
	
	Dem1(){
		
		super(12,3);
		System.out.println(super.f);
		super.d();
		super.d(2);
		System.out.println("World");
	}
	
}

public class new3 {
	public static void main(String[] args) {
		Dem1 d=new Dem1();
		
		
	}

}
