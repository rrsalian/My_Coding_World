import java.util.InputMismatchException;
import java.util.Scanner;

public class Mobile {
	public static void getMobile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Mobile  ############");
		System.out.println("\n");
		System.out.println("1. Apple iPhone XS Max    | MRP.99,999  Rs");
		System.out.println("2. Google Pixel 3XL       | MRP.92,000  Rs");
		System.out.println("3. Samsung Galaxy Note 9  | MRP.84,000  Rs");
		System.out.println("4. One Plus 6T            | MRP.41,999  Rs");
		System.out.println("5. Redmi Note 6 Pro       | MRP.13,999  Rs");
		System.out.println("6. Nokia 8 Sirocco        | MRP.36,999  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Apple iPhone XS Max",99999);
			break;
		case 2:
			Cart.addCart("Google Pixel 3XL",92000);
			break;
		case 3:
			Cart.addCart("Samsung Galaxy Note 9",84000);
			break;
		case 4:
			Cart.addCart("One Plus 6T",41999);
			break;
		case 5:
			Cart.addCart("Redmi Note 6 Pro",13999);
			break;
		case 6:
			Cart.addCart("Nokia 8 Sirocco",36999);
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
				getMobile();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getMobile();
			
		}
	}
}
