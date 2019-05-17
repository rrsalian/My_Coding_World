import java.util.InputMismatchException;
import java.util.Scanner;

public class Toy {
	public static void getToy() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Toys  ############");
		System.out.println("\n");
		System.out.println("1. Jack Royal SUV Red Toy | MRP.1999 Rs");
		System.out.println("2. YAMAHA Crawler Toy     | MRP.1000 Rs");
		System.out.println("3. Mitashi Land Rover Toy | MRP.1262 Rs");
		System.out.println("4. Bugatti Remote Car Toy | MRP.1299 Rs");
		System.out.println("5. Ferrari Remote Car Toy | MRP.899  Rs");
		System.out.println("6. Hummer Rock Crawler Toy| MRP.771  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Jack Royal SUV Red Toy",1999);
			break;
		case 2:
			Cart.addCart("YAMAHA Crawler Toy",1000);
			break;
		case 3:
			Cart.addCart("Mitashi Land Rover Toy",1262);
			break;
		case 4:
			Cart.addCart("Bugatti Remote Car Toy",1299);
			break;
		case 5:
			Cart.addCart("Ferrari Remote Car Toy",899);
			break;
		case 6:
			Cart.addCart("Hummer Rock Crawler Toy",771);
			break;
		case 7:
			Kid.getKids();
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
				getToy();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getToy();
		}
		
	}
}
