 class A {
void add(int x,float y) {
	
}
void add(float x,int y) {
	
}
}
class Ambigity{
	public static void main(String[] args) {
		A a=new A();
		//add(10, 20.0f);
	}
}
