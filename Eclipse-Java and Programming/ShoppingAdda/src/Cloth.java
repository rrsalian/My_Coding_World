import java.util.InputMismatchException;
import java.util.Scanner;

public class Cloth {
	public static void getCloth() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  CLOTHS  ############");
		System.out.println("\n");
		System.out.println("1. Men's");
		System.out.println("2. Womans's");
		System.out.println("3. Kids");
		System.out.println("4. Back to Previous");
		System.out.println("5. Exit");
		System.out.println("Enter the choice");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Men.getMens();
			break;
		case 2:
			Woman.getWoman();
			break;
		case 3:
			Kid.getKids();
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
				getCloth();
				break;
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getCloth();
		}
   }
}
