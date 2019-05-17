class An{
	public void show() {
		System.out.println("show A");
	}
}

//Java anonymous class are like local class or inner class without a name.
//We can use java anonymous class to declare and instantiate a class at the same time.


public class AnonymousClass {
	public static void main(String[] args) {
		
		
		An a=new An(){
			public void show() {
				System.out.println("hellooo");
			}
		};
		a.show();
		
	}

}
