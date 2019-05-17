import java.util.InputMismatchException;
import java.util.Scanner;

public class Shirt {
	public static void getShirt() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Shirts  ############");
		System.out.println("\n");
		System.out.println("1. Peter England Shirt   | MRP.999  Rs");
		System.out.println("2. Arrow Shirt           | MRP.1000 Rs");
		System.out.println("3. U.S. Polo Shirt       | MRP.1500 Rs");
		System.out.println("4. LP Louis Philipe Shirt| MRP.1200 Rs");
		System.out.println("5. Jhon Player Shirt     | MRP.899  Rs");
		System.out.println("6. Mufti Shirt           | MRP.799  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Peter England Shirt",999);
			break;
		case 2:
			Cart.addCart("Arrow Shirt",1000);
			break;
		case 3:
			Cart.addCart("U.S. Polo Shirt",1500);
			break;
		case 4:
			Cart.addCart("LP Louis Philipe Shirt",1200);
			break;
		case 5:
			Cart.addCart("Jhon Player Shirt",899);
			break;
		case 6:
			Cart.addCart("Mufti Shirt",799);
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
				getShirt();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getShirt();
			
		}
	}

}
