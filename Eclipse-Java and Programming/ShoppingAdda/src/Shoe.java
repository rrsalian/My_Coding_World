import java.util.InputMismatchException;
import java.util.Scanner;

public class Shoe {
	public static void getShoes() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Shoes  ############");
		System.out.println("\n");
		System.out.println("1. Casual  Shoes");
		System.out.println("2. Formal Shoes");
		System.out.println("3. Sports Shoes");
		System.out.println("4. Back to Previous");
		System.out.println("5. Exit");
		System.out.println("Enter the choice");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Casual.getCasual();
			break;
		case 2:
			Formal.getFormal();
			break;
		case 3:
			Sports.getSports();
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
				getShoes();
				break;
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getShoes();
			
		}
   }
}
