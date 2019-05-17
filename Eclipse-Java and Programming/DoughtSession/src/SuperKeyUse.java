class SuperUse
{  int a;
	SuperUse()
	{
		System.out.println("This is parent class constructor");
	}
	void m(){
		System.out.println("Parent class method");
	}
}
class S extends SuperUse
{
	S(){
		super(); 	  //used to invoke parent class constructor
		super.m();    //used to invoke parent class Mehtod
		super.a=100;  //used to invoke parent class Variable
		
	}
}
public class SuperKeyUse {
	public static void main(String[] args) {
		S s=new S();
		System.out.println(s.a);
	}

}
