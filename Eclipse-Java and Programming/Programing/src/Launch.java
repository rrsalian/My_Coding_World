
class Plane {
	
	void takeOff(){
		System.out.println("plane is tacking off");
	}
	void fly() {
		System.out.println("plane is fying");
		
	}
	void land() {
		System.out.println("plane is landing");
		
	}
}

class CargoPlane extends Plane {
	void fly(){
		System.out.println("cargo plane fly at low height");
		
	}
	void carryCargo()
	{
		System.out.println("cargo plane carries cargo");
		
	}
	
	
}

class PassengerPlane extends Plane{
	void fly() {
		System.out.println("passenger plane fly at medium ");
		
	}
	void carryPassenger() {
		System.out.println("passenger palne carries passenger");
	}
}
class FighterPlane extends Plane{
	void fly() {
		System.out.println("fighter plane fly at high");
		
	}
	void carryWeaons() {
		System.out.println("fighter plane carries weapons");
		
	}
	
}
class Launch{
	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carryCargo();
		System.out.println();
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.carryPassenger();
		System.out.println();
		fp.takeOff();
		fp.fly();
		fp.land();
		fp.carryWeaons();
	}
} 