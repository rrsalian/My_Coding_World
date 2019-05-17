import java.util.InputMismatchException;
import java.util.Scanner;

public class Light {
	public static void getLight() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############   Light  ############");
		System.out.println("\n");
		System.out.println("1. Philips T-Bulb                  | MRP.549   Rs");
		System.out.println("2. Syska Smart Light               | MRP.999   Rs");
		System.out.println("3. Wipro Granet Smart Light        | MRP.1,099 Rs");
		System.out.println("4. Crompton LED Batten             | MRP.535   Rs");
		System.out.println("5. Everedy LED Rechargable Torch   | MRP.260   Rs");
		System.out.println("6. Havells Rayline                 | MRP.1,000 Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Philips T-Bulb",549);
			break;
		case 2:
			Cart.addCart("Syska Smart Light",999);
			break;
		case 3:
			Cart.addCart("Wipro Granet Smart Light",1099);
			break;
		case 4:
			Cart.addCart("Crompton LED Batten",535);
			break;
		case 5:
			Cart.addCart("Everedy LED Rechargable Torch",260);
			break;
		case 6:
			Cart.addCart("Havells Rayline",1000);
			break;
		case 7:
			Home.getHome();
			break;
		case 8:
			Main.category();
			break;
		case 9:
			Exit.getExit();
			break;
		default:
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
				getLight();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getLight();
			
		}
	}
}
