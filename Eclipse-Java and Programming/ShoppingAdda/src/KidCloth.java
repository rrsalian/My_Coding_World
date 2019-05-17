import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KidCloth {
	public static void getKidCloth() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Kids Cloth   ############");
		System.out.println("\n");
		System.out.println("1. United Colors of Bentton    | MRP.699  Rs");
		System.out.println("2. Allen Solly Junior          | MRP.999  Rs");
		System.out.println("3. U.S. Polo Kids              | MRP.499  Rs");
		System.out.println("4. 612 League                  | MRP.799  Rs");
		System.out.println("5. Mini Klub                   | MRP.899  Rs");
		System.out.println("6. Provogue                    | MRP.661  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("United Colors of Bentton",699);
			break;
		case 2:
			Cart.addCart("Allen Solly Junior",999);
			break;
		case 3:
			Cart.addCart("U.S. Polo Kids",499);
			break;
		case 4:
			Cart.addCart("612 League",799);
			break;
		case 5:
			Cart.addCart("Mini Klub",899);
			break;
		case 6:
			Cart.addCart("Provogue",661);
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
				getKidCloth();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getKidCloth();
			
		}
	}
}
