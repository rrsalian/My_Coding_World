import java.util.InputMismatchException;
import java.util.Scanner;

public class Kurthas {
	public static void getKurthas() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Kurthas  ############");
		System.out.println("\n");
		System.out.println("1. Aahwan Kurthas          | MRP.999  Rs");
		System.out.println("2. Very Me Kurthas         | MRP.600  Rs");
		System.out.println("3. Aurelia Kurthas         | MRP.550  Rs");
		System.out.println("4. Desier Kurthas          | MRP.499  Rs");
		System.out.println("5. Srishti Kurthas         | MRP.459  Rs");
		System.out.println("6. Krapal Kurthas          | MRP.450  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Aahwan Kurthas",999);
			break;
		case 2:
			Cart.addCart("Very Me Kurthas",600);
			break;
		case 3:
			Cart.addCart("Aurelia Kurthas",550);
			break;
		case 4:
			Cart.addCart("Desier Kurthas",499);
			break;
		case 5:
			Cart.addCart("Srishti Kurthas",459);
			break;
		case 6:
			Cart.addCart("Krapal Kurthas",450);
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
				getKurthas();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getKurthas();
			
		}
		
	}
}
