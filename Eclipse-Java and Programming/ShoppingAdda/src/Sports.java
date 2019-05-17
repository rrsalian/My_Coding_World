import java.util.InputMismatchException;
import java.util.Scanner;

public class Sports {
	public static void getSports() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############   Sports Shoes  ############");
		System.out.println("\n");
		System.out.println("1. Adidas Running Shoes            | MRP.18,999  Rs");
		System.out.println("2. Puma Football Shoes             | MRP.14,399  Rs");
		System.out.println("3. Jordan Air                      | MRP.43,091  Rs");
		System.out.println("4. Reebok Running Shoe             | MRP.2,320   Rs");
		System.out.println("5. Fila Acumen Shoe                | MRP.3,199   Rs");
		System.out.println("6. Nike Superfly Shoe              | MRP.7,597   Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Adidas Running Shoes ",18999);
			break;
		case 2:
			Cart.addCart("Puma Football Shoes",14399);
			break;
		case 3:
			Cart.addCart("Jordan Air Shoe",43091);
			break;
		case 4:
			Cart.addCart("Reebok Running Shoe",2320);
			break;
		case 5:
			Cart.addCart("Fila Acumen Shoe",3199);
			break;
		case 6:
			Cart.addCart("Nike Superfly Shoe",7597);
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
				getSports();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getSports();
		}
	}
}
