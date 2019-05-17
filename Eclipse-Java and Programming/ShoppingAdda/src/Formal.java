import java.util.InputMismatchException;
import java.util.Scanner;

public class Formal {
	public static void getFormal() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############   Formal Shoes  ############");
		System.out.println("\n");
		System.out.println("1. Woodland Slip On                | MRP.2,899  Rs");
		System.out.println("2. Crown Sapphire                  | MRP.899    Rs");
		System.out.println("3. Lee Cooper Sneakers             | MRP.1,949  Rs");
		System.out.println("4. Provogue Slip On                | MRP.948    Rs");
		System.out.println("5. Bata Premium Derby              | MRP.999    Rs");
		System.out.println("6. Red Chief Slip On               | MRP.2,157  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Woodland Slip On ",2899);
			break;
		case 2:
			Cart.addCart("Crown Sapphire ",899);
			break;
		case 3:
			Cart.addCart("Lee Cooper Sneakers",1949);
			break;
		case 4:
			Cart.addCart("Provogue Slip On",948);
			break;
		case 5:
			Cart.addCart("Bata Premium Derby ",999);
			break;
		case 6:
			Cart.addCart("Red Chief Slip On",2157);
			break;
		case 7:
			Shoe.getShoes();
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
				getFormal();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getFormal();
			
		}
	}
}
