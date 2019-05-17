import java.util.InputMismatchException;
import java.util.Scanner;

public class KidShoes {
	public static void getKidShoes() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Sarees  ############");
		System.out.println("\n");
		System.out.println("1. Puma Sneakers       | MRP.1919 Rs");
		System.out.println("2. REEBOK Running Shoes| MRP.1000 Rs");
		System.out.println("3. Nike Shoes          | MRP.1700 Rs");
		System.out.println("4. UCB Shoes           | MRP.1300 Rs");
		System.out.println("5. Disney Shoes        | MRP.899  Rs");
		System.out.println("6. Bunnies Shoes       | MRP.599  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Puma Sneakers",1919);
			break;
		case 2:
			Cart.addCart("REEBOK Running Shoes",1000);
			break;
		case 3:
			Cart.addCart("Nike Shoes",1700);
			break;
		case 4:
			Cart.addCart("UCB Shoes",1300);
			break;
		case 5:
			Cart.addCart("Disney Shoes",899);
			break;
		case 6:
			Cart.addCart("Bunnies Shoes",599);
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
				getKidShoes();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getKidShoes();
			
		}
	}
}
