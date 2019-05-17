class Sample1{	
	//constructor
	Sample1()
	{
		System.out.println("constructor");
	}
	
	//static block
	static
	{
		System.out.println("staic block");
	}
	
	//non-static block
	{
		System.out.println("non static block");
	}
	



	public static void main(String[] args) {
		
			System.out.println("main ");
			new Sample1();
			new Sample1();
		}
}
