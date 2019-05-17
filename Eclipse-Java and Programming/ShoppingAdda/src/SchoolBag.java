import java.util.InputMismatchException;
import java.util.Scanner;

public class SchoolBag {
	public static void getSchoolBag() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  School Bag  ############");
		System.out.println("\n");
		System.out.println("1. HP School Bag    | MRP.260  Rs");
		System.out.println("2. DZert Backpack   | MRP.494  Rs");
		System.out.println("3. Skylocks Bag     | MRP.399  Rs");
		System.out.println("4. Luxur Bag        | MRP.1000 Rs");
		System.out.println("5. Amerian Tourist  | MRP.899  Rs");
		System.out.println("6. Skybags          | MRP.799  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("HP School Bag",260);
			break;
		case 2:
			Cart.addCart("DZert Backpack",494);
			break;
		case 3:
			Cart.addCart("Skylocks Bag",399);
			break;
		case 4:
			Cart.addCart("Luxur Bag ",1000);
			break;
		case 5:
			Cart.addCart("Amerian Tourist",899);
			break;
		case 6:
			Cart.addCart("Skybags",799);
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
				getSchoolBag();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getSchoolBag();
			
		}
	}
}
