import java.util.InputMismatchException;
import java.util.Scanner;

public class NonFiction {
	public static void getNonFiction() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  NonFiction Books  ############");
		System.out.println("\n");
		System.out.println("1. Life's Amazing Secrets (Das Gaur Gopal)    | MRP.142  Rs");
		System.out.println("2. Alibaba (Clark Duncan)                     | MRP.358  Rs");
		System.out.println("3. Playing It My Way (Tendulkar Sachin)       | MRP.127  Rs");
		System.out.println("4. Wings of Fire (Tiwari Arun)                | MRP.260  Rs");
		System.out.println("5. Exam Warriors (Modi Narendra)              | MRP.291  Rs");
		System.out.println("6. Elon Musk (Ashkee Vance)                   | MRP.258  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Life's Amazing Secrets (Das Gaur Gopal)",142);
			break;
		case 2:
			Cart.addCart("Alibaba (Clark Duncan)",358);
			break;
		case 3:
			Cart.addCart("Playing It My Way (Tendulkar Sachin)",127);
			break;
		case 4:
			Cart.addCart("Wings of Fire (Tiwari Arun)",260);
			break;
		case 5:
			Cart.addCart("Exam Warriors (Modi Narendra)",291);
			break;
		case 6:
			Cart.addCart("Elon Musk (Ashkee Vance)",258);
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
				getNonFiction();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getNonFiction();
			
		}
	}
}
