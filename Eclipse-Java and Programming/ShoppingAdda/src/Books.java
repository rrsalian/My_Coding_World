import java.util.InputMismatchException;
import java.util.Scanner;

public class Books {
	public static void getBooks() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Books  ############");
		System.out.println("1. Fiction");
		System.out.println("2. NonFiction");
		System.out.println("3. TextBook");
		System.out.println("4. Back to Previous");
		System.out.println("5. Exit");
		System.out.println("Enter the choice");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Fiction.getFiction();
			break;
		case 2:
			NonFiction.getNonFiction();
			break;
		case 3:
			TextBook.getTextBook();
			break;
		case 4:
			Main.category();
			break;
		case 5:
			Exit.getExit();
			break;
		default:
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();

			getBooks();
			break;
		}
	}
	catch (InputMismatchException e) {
		System.out.println("\n");
		System.out.println("Enter the valid input");
		System.out.println();
		getBooks();
		
	}
		
   }
}
