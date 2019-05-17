import java.util.InputMismatchException;
import java.util.Scanner;

public class Kid {
	public static void getKids() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Kids Section  ############");
		System.out.println("\n");
		System.out.println("1. Toy");
		System.out.println("2. Kids Clothing");
		System.out.println("3. School Bag");
		System.out.println("4. Kid Shoes");
		System.out.println();
		System.out.println("5. Back to Previous");
		System.out.println("6. Back to MainMenu");
		System.out.println("7. Exit");
		System.out.println("Enter the choice");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Toy.getToy();
			break;
		case 2:
			KidCloth.getKidCloth();
			break;
		case 3:
			SchoolBag.getSchoolBag();
			break;
		case 4:
			KidShoes.getKidShoes();
			break;
		case 5:
			Cloth.getCloth();
			break;
		case 6:
			Main.category();
			break;
		case 7:
			Exit.getExit();
			break;
		default:
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
				getKids();
				break;
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getKids();
			
		}
	}
}
