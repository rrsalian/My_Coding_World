interface AAA{
	void show();
	static void print() {
		System.out.println("this is static methid inside Interface");
	}

	static void print(int a) {
		System.out.println("this is static methid inside Interface Overloaded");
	}
}


public class InterfaceStaticMethod {
	public static void main(String[] args) {
		AAA.print(2);


		//Anonymous Class
		AAA a=new AAA() {
			public void show() {
				System.out.println("this is void show method");
			}
		};
		a.show();
		
		
		//Lambda Function
		AAA aa=()->System.out.println("this is lambda function");
		aa.show();

	}


}
