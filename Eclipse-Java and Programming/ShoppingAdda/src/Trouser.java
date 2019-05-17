import java.util.InputMismatchException;
import java.util.Scanner;

public class Trouser {
	public static void getTrouser() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############   Trouser  ############");
		System.out.println("\n");
		System.out.println("1. Peter England Trouser   | MRP.1499  Rs");
		System.out.println("2. Indian Terrain Trouser  | MRP.1600 Rs");
		System.out.println("3. U.S. Polo Trouser       | MRP.1500 Rs");
		System.out.println("4. Highlander Trouser      | MRP.1200 Rs");
		System.out.println("5. Jhon Player Trouser     | MRP.899  Rs");
		System.out.println("6. Van Heusen Trouser      | MRP.1399  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Peter England Trouser",1499);
			break;
		case 2:
			Cart.addCart("Indian Terrain Trouser",1600);
			break;
		case 3:
			Cart.addCart("U.S. Polo Trouser",1500);
			break;
		case 4:
			Cart.addCart("Highlander Trouser",1200);
			break;
		case 5:
			Cart.addCart("Jhon Player Trouser",899);
			break;
		case 6:
			Cart.addCart("Van Heusen Trouser",1399);
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
				getTrouser();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getTrouser();
			
		}
	}
}
