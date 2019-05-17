import java.util.InputMismatchException;
import java.util.Scanner;

public class Jeans {
	public static void getJeans() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Jeans  ############");
		System.out.println("\n");
		System.out.println("1. Levi's Jeans          | MRP.1999  Rs");
		System.out.println("2. Lee Jeans             | MRP.1400 Rs");
		System.out.println("3. WRONG Jeans           | MRP.1200 Rs");
		System.out.println("4. Flying Machine Jeans  | MRP.1200 Rs");
		System.out.println("5. Jhon Player Jeans     | MRP.999  Rs");
		System.out.println("6. Mufti Jeans           | MRP.1499  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Levi's Jeans",1999);
			break;
		case 2:
			Cart.addCart("Lee Jeans",1400);
			break;
		case 3:
			Cart.addCart("WRONG Jeans",1200);
			break;
		case 4:
			Cart.addCart("Flying Machine Jeans",1200);
			break;
		case 5:
			Cart.addCart("Jhon Player Jeans",999);
			break;
		case 6:
			Cart.addCart("Mufti Jeans",1499);
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
				getJeans();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getJeans();
			
		}
	}
}
