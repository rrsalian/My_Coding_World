package rakshith;



class A{
// this is example for recursive constructor execution 
//	A(){
//		this();
//	}
	int a;
	int b;
	static {
	   //a++;   static block/method can't access the nonstatic variable
	}
	static void abc() {
		 //a++;   static block/method can't access the nonstatic variable
		
	}
	
	A(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	
}

public class new1 {
	
	//A obj=new A();
	//if programmer create a constructor then 
	//the compiler doesnt creat a default constructor

}
