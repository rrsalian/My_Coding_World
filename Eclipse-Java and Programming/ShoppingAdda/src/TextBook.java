import java.util.InputMismatchException;
import java.util.Scanner;

public class TextBook {
	public static void getTextBook() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  TextBook  ############");
		System.out.println("\n");
		System.out.println("1. Introduction to Electrodynamics(David G)    | MRP.391  Rs");
		System.out.println("2. Theory of Machines(Rattan)                  | MRP.429  Rs");
		System.out.println("3. Programming in Java(Balagurusamy)           | MRP.450  Rs");
		System.out.println("4. JavaScript (Powell Thomas)                  | MRP.913  Rs");
		System.out.println("5. Python Programming(Swapnil Saurav)          | MRP.290  Rs");
		System.out.println("6. Quantative Aptitide(R.S. Aggarwal)          | MRP.258  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Introduction to Electrodynamics(David G)",391);
			break;
		case 2:
			Cart.addCart("Theory of Machines(Rattan)",429);
			break;
		case 3:
			Cart.addCart("Programming in Java(Balagurusamy)",450);
			break;
		case 4:
			Cart.addCart("JavaScript (Powell Thomas)",913);
			break;
		case 5:
			Cart.addCart("Python Programming(Swapnil Saurav)",290);
			break;
		case 6:
			Cart.addCart("Quantative Aptitide(R.S. Aggarwal)",258);
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
				getTextBook();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getTextBook();
			
		}
	}
}
