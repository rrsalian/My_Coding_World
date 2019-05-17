class StringDemo
{
	String s;
	StringDemo(String s){
		this.s=s;
	}
	
	public String toString() {
		return s;
	}
	
}

class HowToString {
	public static void main(String[] args) {
		StringDemo obj=new StringDemo("hello");
		System.out.println(obj);
	}
	
	
}
