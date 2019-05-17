import java.util.InputMismatchException;
import java.util.Scanner;

public class Men {
	public static void getMens() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  MEN Section  ############");
		System.out.println("\n");
		System.out.println("1. Shirts");
		System.out.println("2. T-Shirts");
		System.out.println("3. Jeans");
		System.out.println("4. Trouser");
		System.out.println("5. Back to Previous");
		System.out.println("6. Back to MainMenu");
		System.out.println("7. Exit");
		System.out.println("Enter the choice");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Shirt.getShirt();
			break;
		case 2:
				Tshirt.getTshirt();
			break;
		case 3:
				Jeans.getJeans();
			break;
		case 4:
			Trouser.getTrouser();
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
				getMens();
				break;
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getMens();
			
		}
   }

}
