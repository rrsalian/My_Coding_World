import java.util.InputMismatchException;
import java.util.Scanner;

public class Fiction {
	public static void getFiction() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Fiction Books  ############");
		System.out.println("\n");
		System.out.println("1. Black Hole (Hawking Stephen)    | MRP.94   Rs");
		System.out.println("2. Relativity (Albert Einstein)    | MRP.190  Rs");
		System.out.println("3. The Perfect us                  | MRP.127  Rs");
		System.out.println("4. The 3 Mistakes of My Life       | MRP.113  Rs");
		System.out.println("5. Elevation(King Stephen)         | MRP.291  Rs");
		System.out.println("6. The Lost Order                  | MRP.258  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Black Hole (Hawking Stephen)",94);
			break;
		case 2:
			Cart.addCart("Relativity (Albert Einstein)",190);
			break;
		case 3:
			Cart.addCart("The Perfect us",127);
			break;
		case 4:
			Cart.addCart("The 3 Mistakes of My Life",113);
			break;
		case 5:
			Cart.addCart("Elevation(King Stephen)",291);
			break;
		case 6:
			Cart.addCart("The Lost Order ",258);
			break;
		case 7:
			Books.getBooks();
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
				getFiction();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getFiction();
			
		}
	}
}
