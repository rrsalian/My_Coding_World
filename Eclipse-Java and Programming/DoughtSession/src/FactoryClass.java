abstract class Car{
	abstract void start();
	abstract void stop();
}

class BMW extends Car{
	void start() {
		System.out.println("BMW start");
	}
	void stop() {
		System.out.println("BMW stop");
	}
}


class Audi extends Car{
	void start() {
		System.out.println("Audi start");
	}
	void stop() {
		System.out.println("Audi stop");
	}
}

class Factory{
	void production(Car c){
		
		c.start();
		c.stop();
		
	}
}


public class FactoryClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW bmw=new BMW();
		Audi a=new Audi();
		
		Factory f=new Factory();
		f.production(bmw);
		f.production(a);
		

	}

}
