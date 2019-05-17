
//........................Final Variable....................
class ABC{
	
	final int i;  //Final variable
	public ABC() {
		
		i=10; //For final variable once it is assigned we can't reassign
		//i=20; Error: We can't reassign
	}
	
}


//.........................Final Class..............................
final class Bb{
	

}

class C //extends Bb
{  
	
         //  You can't extend final class

}



//.........................Final Method.......................

class D{
	
	final void show() {
		System.out.println("In D");
		
	}
	
	public void show(int a) {
		System.out.println("show");
		//Final Method can overload
		
	}
	
}

class E extends D{
/*	
   @Override
   void show() {
		final method cant be override
	}                                */
}

//.................................................................

public class Final {
	public static void main(String[] args) {
		
		ABC a=new ABC();
		System.out.println(a.i);
		
	}

}
