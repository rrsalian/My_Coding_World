import java.util.InputMismatchException;
import java.util.Scanner;

public class Woman {
	public static void getWoman() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Womans Section  ############");
		System.out.println("\n");
		System.out.println("1. Sarees");
		System.out.println("2. Kurthas");
		System.out.println("3. Lehenga");
		System.out.println("4. Back to Previous");
		System.out.println("5. Back to MainMenu");
		System.out.println("5. Exit");
		System.out.println("Enter the choice");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Sarees.getSarees();
			break;
		case 2:
			Kurthas.getKurthas();
			break;
		case 3:
			Lehenga.getLehenga();
			break;
		case 4:
			Cloth.getCloth();
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
				getWoman();
				break;
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getWoman();
			
		}
	}
}
