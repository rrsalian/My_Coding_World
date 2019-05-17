class Demo1This{
	int a;
	int b;

	void m1() {
		System.out.println("Method m using this ");
	}

	Demo1This m2() {
		return this; 	 // using this return the current class instence(address)
	}

	void m3(Demo1This e) {
		System.out.println(e+" Passed as parameter");
	}

	Demo1This(int a) 
	{
		this();				//this() to call current class constructor
		this.a=a;			//this keyword to current class instance variable
	}
	Demo1This()
	{  
		this(10,20); 
		m3(this);           //this as method parameter
		System.out.println("Default Constructor");
	}
	Demo1This(int b, int a)
	{   this.m1();    			 //this invoke the current class method
	System.out.println(a+" "+b);
	}
}
public class ThisKeywordUse {
	public static void main(String[] args) {
		Demo1This d=new Demo1This();
		System.out.println(d.m2()+" Current class instance");
	}

}
