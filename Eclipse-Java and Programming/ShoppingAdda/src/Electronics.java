import java.util.InputMismatchException;
import java.util.Scanner;

public class Electronics {
	public static void getElectronics() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Electronics  ############");
		System.out.println("\n");
		System.out.println("1. Mobile");
		System.out.println("2. Laptop");
		System.out.println("3. Televisions");
		System.out.println("4. Camera");
		System.out.println("5. Back to Previous");
		System.out.println("6. Exit");
		System.out.println("Enter the choice");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Mobile.getMobile();
			break;
		case 2:
			Laptop.getLaptop();
			break;
		case 3:
			Tv.getTv();
			break;
		case 4:
			Camera.getCamera();
			break;
		case 5:
			Main.category();
			break;
		case 6:
			Exit.getExit();
			break;
		default:
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
				getElectronics();
				break;
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getElectronics();
		}
   }
}
