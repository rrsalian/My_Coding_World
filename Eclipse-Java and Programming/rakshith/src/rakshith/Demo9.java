package rakshith;

 class Aa{
	public static void abc() {
		
		final int ww;
		ww=4;
		System.out.println("Aa");
	}
	
	public static void abc(int i) {
		System.out.println("Aa "+i);
	}
	
}

class Bb extends Aa{
	
	//Can't override a final method 
	public static void abc() {
		System.out.println("Bb");
	}
}

public class Demo9 extends Aa{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa a=new Bb();
		a.abc();
		
		
		

	}
	
}
