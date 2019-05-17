class ML
{
	void add(float a,int b) {
		System.out.println("add1");
	}

	void add (float e,float c) {
		System.out.println("add2");
	}
	
}
class B extends ML
{
	void add(int a,float  b) {
		System.out.println("add3");
	}
}
public class MethodOverloading {
	
public static void main(String[] args) {
 ML m=new B();        //lose coupling
 m.add(2.3f , 2); 
 m.add(2 , 4.4f);
//m.add(3,3);         // Ambiguity
 
 
}
}
