import java.util.InputMismatchException;
import java.util.Scanner;

public class Sarees {
	public static void getSarees() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Sarees  ############");
		System.out.println("\n");
		System.out.println("1. M.S. Retail Sarees     | MRP.9999  Rs");
		System.out.println("2. Saarah Sarees          | MRP.1400 Rs");
		System.out.println("3. Mimoasa Sarees         | MRP.7200 Rs");
		System.out.println("4. Rohi Sarees            | MRP.5200 Rs");
		System.out.println("5. Aaavaa Sarees          | MRP.2999  Rs");
		System.out.println("6. Odhuni Sarees          | MRP.3499  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("M.S. Retail Sarees",9999);
			break;
		case 2:
			Cart.addCart("Saarah Sarees",1400);
			break;
		case 3:
			Cart.addCart("Mimoasa Sarees",7200);
			break;
		case 4:
			Cart.addCart("Rohi Sarees",5200);
			break;
		case 5:
			Cart.addCart("Aaavaa Sarees",2999);
			break;
		case 6:
			Cart.addCart("Odhuni Sarees",3499);
			break;
		case 7:
			Woman.getWoman();
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
				getSarees();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getSarees();
			
		}
		
	}
}
