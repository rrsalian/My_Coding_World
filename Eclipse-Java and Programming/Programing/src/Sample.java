class Dem{
 
	//constructor
	Dem()
	{
		System.out.println("constructor1");
	}
	Dem(int a,int b)
	{
		System.out.println("constructor1");
		System.out.println(a);
		System.out.println(b);
	}
	
	//static block
	static
	{
		System.out.println("staic block1");
	}
	
	//non-static block
	{
		System.out.println("non static block1");
	}
	
}

class Dem1 extends Dem{
	 
	//constructor
	Dem1()
	{ 
		super(10,30);
		System.out.println("constructor2");
	}
	
	//static block
	static
	{
		System.out.println("staic block2");
	}
	
	//non-static block
	{
		System.out.println("non static block2");
	}
	
}


class Sample {
	public static void main(String[] args) {
		
		
			Dem d=new Dem1();
		
		}
}
