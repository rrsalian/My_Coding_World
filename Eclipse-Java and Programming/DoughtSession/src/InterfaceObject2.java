
interface check {
	public void message();
}

public class InterfaceObject2 {
	public static void main(String[] args) {

		check t = new check() {
			public void message() {
				System.out.println("Method defined in the interface");
			}
		};
		t.message();
	}
}
