import java.util.InputMismatchException;
import java.util.Scanner;

public class Casual {
	public static void getCasual() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############   Casual Shoes  ############");
		System.out.println("\n");
		System.out.println("1. Puma   Sneakers                 | MRP.2,999  Rs");
		System.out.println("2. Levi's Sneakers                 | MRP.1,399  Rs");
		System.out.println("3. Sparx  Sneakers                 | MRP.1,599  Rs");
		System.out.println("4. Adidas Sneakers                 | MRP.2,399  Rs");
		System.out.println("5. Diesel Sneakers                 | MRP.3,999  Rs");
		System.out.println("6. Clark  Sneakers                 | MRP.4,699  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Puma   Sneakers",2999);
			break;
		case 2:
			Cart.addCart("Levi's Sneakers",1399);
			break;
		case 3:
			Cart.addCart("Sparx  Sneakers",1599);
			break;
		case 4:
			Cart.addCart("Adidas Sneakers",2399);
			break;
		case 5:
			Cart.addCart("Diesel Sneakers",3999);
			break;
		case 6:
			Cart.addCart("Clark  Sneakers",4699);
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
				getCasual();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getCasual();
			
		}
	}
}
