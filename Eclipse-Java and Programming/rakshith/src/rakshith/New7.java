package rakshith;
 class T{
	
  	T(int x){
  		System.out.println("construcor "+x);
  	}
  
}

public class New7{
	T t=new T(7);
	New7(int i){
		System.out.println("hiii");
		t=new T(i);
	}
	public static void main(String[] args) {
		System.out.println("heeeeee");
		New7 n=new New7(5);
		
	}
	
}