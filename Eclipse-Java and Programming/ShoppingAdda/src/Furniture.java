import java.util.InputMismatchException;
import java.util.Scanner;

public class Furniture {
	public static void getFurniture() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############   Furniture  ############");
		System.out.println("\n");
		System.out.println("1. L-Shaped Sofa                   | MRP.11,999  Rs");
		System.out.println("2. Soft Sofa                       | MRP.15,749  Rs");
		System.out.println("3. Dining Set                      | MRP.5,999   Rs");
		System.out.println("4. Coffee Table                    | MRP.2,399   Rs");
		System.out.println("5. Office Chair                    | MRP.3,999   Rs");
		System.out.println("6. Portable Laptop Table           | MRP.699     Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("L-Shaped Sofa",11999);
			break;
		case 2:
			Cart.addCart("Soft Sofa",15749);
			break;
		case 3:
			Cart.addCart("Dining Set",5999);
			break;
		case 4:
			Cart.addCart("Coffee Table",2399);
			break;
		case 5:
			Cart.addCart("Office Chair",3999);
			break;
		case 6:
			Cart.addCart("Portable Laptop Table",699);
			break;
		case 7:
			Home.getHome();
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
				getFurniture();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getFurniture();
			
		}
	}
}
