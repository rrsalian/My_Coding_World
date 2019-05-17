import java.util.InputMismatchException;
import java.util.Scanner;

public class Lehenga {
	public static void getLehenga() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Lehenga  ############");
		System.out.println("\n");
		System.out.println("1. Florence Lehenga        | MRP.1999  Rs");
		System.out.println("2. Bhakthi Creation Lehenga| MRP.1400  Rs");
		System.out.println("3. S.B Creation Lehenga    | MRP.1600  Rs");
		System.out.println("4. Ganes Lehenga           | MRP.520   Rs");
		System.out.println("5. Kedar Fab Lehenga       | MRP.1099  Rs");
		System.out.println("6. Pranitha Lehenga        | MRP.699   Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Florence Lehenga",1999);
			break;
		case 2:
			Cart.addCart("Bhakthi Creation Lehenga",1400);
			break;
		case 3:
			Cart.addCart("S.B Creation Lehenga",1600);
			break;
		case 4:
			Cart.addCart("Ganes Lehenga",520);
			break;
		case 5:
			Cart.addCart("Kedar Fab Lehenga",1099);
			break;
		case 6:
			Cart.addCart("Pranitha Lehenga",699);
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
				getLehenga();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getLehenga();
			
		}
		
	}
}
