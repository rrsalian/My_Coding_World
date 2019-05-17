import java.util.InputMismatchException;
import java.util.Scanner;

public class Laptop {
	public static void getLaptop() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Laptop  ############");
		System.out.println("\n");
		System.out.println("1. Apple Mackbook Pro    | MRP.99,999  Rs");
		System.out.println("2. HP Spectre            | MRP.72,000  Rs");
		System.out.println("3. Dell XPS              | MRP.90,000  Rs");
		System.out.println("4. Lenovo Yoga           | MRP.99,000  Rs");
		System.out.println("5. Microsofr Surface Book| MRP.99,888  Rs");
		System.out.println("6. MSI GE                | MRP.98,777  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Apple Mackbook Pro",99999);
			break;
		case 2:
			Cart.addCart("HP Spectre",72000);
			break;
		case 3:
			Cart.addCart("Dell XPS",90000);
			break;
		case 4:
			Cart.addCart("Lenovo Yoga",99000);
			break;
		case 5:
			Cart.addCart("Microsofr Surface Book",99888);
			break;
		case 6:
			Cart.addCart("MSI GE",98777);
			break;
		case 7:
			Electronics.getElectronics();
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
				getLaptop();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getLaptop();
			
		}
	}
}
