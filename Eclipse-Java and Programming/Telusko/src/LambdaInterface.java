

@FunctionalInterface
interface Aa{
	void show();  // Functional Interface -bcz it has Only one method
}
public class LambdaInterface {
	public static void main(String[] args) {
		
		Aa a=()-> System.out.println("This is Lambda functtion");
		// Lambda function works only with Functional Interface
		a.show();
	}
}
