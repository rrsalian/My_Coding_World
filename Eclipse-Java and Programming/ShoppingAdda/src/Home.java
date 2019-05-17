import java.util.InputMismatchException;
import java.util.Scanner;

public class Home {
	public static void getHome() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Home and Kitchen Appliances  ############");
		System.out.println("\n");
		System.out.println("1. Furniture");
		System.out.println("2. Kitchen Appliance");
		System.out.println("3. Light");
		System.out.println("4. Back to Previous");
		System.out.println("5. Exit");
		System.out.println("Enter the choice");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Furniture.getFurniture();
			break;
		case 2:
			Kitchen.getKitchen();
			break;
		case 3:
			Light.getLight();
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
				getHome();
				break;
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getHome();
			
		}
   }
}
