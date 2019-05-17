
class Printer{
	public void show(Number i) {
		System.out.println(i);
	}
}


public class Abstract1 {
	public static void main(String ...args) {
		
		Printer p =new Printer();
		p.show(5.5);
		int k=0;
		Number n=4;
		Number num=new Integer(5);
		System.out.println(num);
	}

}
