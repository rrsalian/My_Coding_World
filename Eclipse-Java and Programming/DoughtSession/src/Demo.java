class A
{  
	int a;
	A()
	{
		System.out.println("from constructor");
	}
	{  
	
		System.out.println(a);
		System.out.println("from non static block");
	}
}
public class Demo {

	public static void main(String[] args) {
		
		new A();
	}
}
