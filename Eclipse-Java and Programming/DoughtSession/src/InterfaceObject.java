interface Demo1
{    int a=10;
	//Creating a concrete method inside Interface
	default void me()
	{
		System.out.println("from interface Demo");
	}
	
}

public class InterfaceObject 
{
	public static void main(String[] args) {
	
	//Creating Object of Interface
	Demo1 obj=new Demo1() {};
	obj.me();
	System.out.println(obj.a);
			
	}
}
