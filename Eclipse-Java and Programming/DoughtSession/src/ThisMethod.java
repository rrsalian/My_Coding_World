class Demo13{
	int a;
	Demo13(){
		this(10,20,40);
		System.out.println("Default Constructor");
	} 
	Demo13(int a){
		this(10,20);
		System.out.println("1 parameterised constructor");
	}
	Demo13(int a,int b){
		this();
		System.out.println("2 parameterised constructor");
	}
	Demo13(int a,int b,int c){
		
	
		System.out.println("3 parameterised constructor");
	}
	
	void disp(int a) {
		
	
		
		System.out.println(this.a=a);
	}
	
}

public class ThisMethod {
public static void main(String[] args) {
	Demo13 d=new Demo13(10);
	d.disp(4);
	System.out.println(d.a);
}
}
