import java.util.InputMismatchException;
import java.util.Scanner;

public class Tshirt {
	public static void getTshirt() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  T-Shirts  ############");
		System.out.println();
		System.out.println("1. Levi's T-Shirt          | MRP.999  Rs");
		System.out.println("2. Adidas T-Shirt          | MRP.1000 Rs");
		System.out.println("3. Lee T-Shirt             | MRP.1150 Rs");
		System.out.println("4. Ducati T-Shirt          | MRP.1100 Rs");
		System.out.println("5. Nike T-Shirt            | MRP.899  Rs");
		System.out.println("6. Puma T-Shirt            | MRP.799  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Levi's T-Shirt",999);
			break;
		case 2:
			Cart.addCart("Adidas T-Shirt",1000);
			break;
		case 3:
			Cart.addCart("Lee T-Shirt",1150);
			break;
		case 4:
			Cart.addCart("Ducati T-Shirt",1100);
			break;
		case 5:
			Cart.addCart("Nike T-Shirt",899);
			break;
		case 6:
			Cart.addCart("Puma T-Shirt",799);
			break;
		case 7:
			Men.getMens();
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
				getTshirt();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getTshirt();
			
		}
	}
}
