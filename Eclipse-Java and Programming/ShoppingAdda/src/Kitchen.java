import java.util.InputMismatchException;
import java.util.Scanner;

public class Kitchen {
	public static void getKitchen() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Kitchen Appliance  ############");
		System.out.println("\n");
		System.out.println("1. Pigeon Pressure Cookers                | MRP.499   Rs");
		System.out.println("2. Prestige Gas Stoves                    | MRP.1,849 Rs");
		System.out.println("3. Presige Cookware set                   | MRP.1,499 Rs");
		System.out.println("4. Pigeon Tawa                            | MRP.599   Rs");
		System.out.println("5. Renberg Knif Set                       | MRP.450   Rs");
		System.out.println("6. Milton Thermosteel                     | MRP.745   Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Pigeon Pressure Cookers",499);
			break;
		case 2:
			Cart.addCart("Prestige Gas Stoves",1849);
			break;
		case 3:
			Cart.addCart("Presige Cookware set",1499);
			break;
		case 4:
			Cart.addCart("Pigeon Tawa",599);
			break;
		case 5:
			Cart.addCart("Renberg Knif Set",450);
			break;
		case 6:
			Cart.addCart("Milton Thermosteel",745);
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
				getKitchen();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getKitchen();
			
		}
	}
}
