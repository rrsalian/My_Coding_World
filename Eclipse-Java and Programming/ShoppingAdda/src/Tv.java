import java.util.InputMismatchException;
import java.util.Scanner;

public class Tv {
	public static void getTv() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  TV  ############");
		System.out.println("\n");
		System.out.println("1. Sony Bravia           | MRP.99,666  Rs");
		System.out.println("2. Samsung Q Series      | MRP.98,555  Rs");
		System.out.println("3. LG Ultra HD           | MRP.96,000  Rs");
		System.out.println("4. Mi LED Samrt TV       | MRP.49,000  Rs");
		System.out.println("5. Panasonic Ultra HD    | MRP.97,444  Rs");
		System.out.println("6. Micromax Ultra HD     | MRP.91,990  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Sony Bravia",99666);
			break;
		case 2:
			Cart.addCart("Samsung Q Series",98555);
			break;
		case 3:
			Cart.addCart("LG Ultra HD",96000);
			break;
		case 4:
			Cart.addCart("Mi LED Samrt TV",49000);
			break;
		case 5:
			Cart.addCart("Panasonic Ultra HD",97444);
			break;
		case 6:
			Cart.addCart("Micromax Ultra HD",91990);
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
				getTv();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getTv();
			
		}
	}
}
