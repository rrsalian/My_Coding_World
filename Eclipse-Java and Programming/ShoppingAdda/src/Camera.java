import java.util.InputMismatchException;
import java.util.Scanner;

public class Camera {
	public static void getCamera() {
		Scanner sc=new Scanner(System.in);
		System.out.println("#############  Camera  ############");
		System.out.println("\n");
		System.out.println("1. Nikon D3400 DSLR      | MRP.49,490  Rs");
		System.out.println("2. Go Pro Fusion         | MRP.54,800  Rs");
		System.out.println("3. Sony DSC-RX           | MRP.45,945  Rs");
		System.out.println("4. Sony Alpha            | MRP.82,990  Rs");
		System.out.println("5. Cannon EOS 77D DSLR   | MRP.59,500  Rs");
		System.out.println("6. Fujifilm X-E3         | MRP.92,665  Rs");
		System.out.println();
		System.out.println("7. Back to Previous");
		System.out.println("8. Back to MainMenu");
		System.out.println("9. Exit");
		try {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Cart.addCart("Nikon D3400 DSLR",49490);
			break;
		case 2:
			Cart.addCart("Go Pro Fusion",54800);
			break;
		case 3:
			Cart.addCart("Sony DSC-RX",45945);
			break;
		case 4:
			Cart.addCart("Sony Alpha",82990);
			break;
		case 5:
			Cart.addCart("Cannon EOS 77D DSLR",59500);
			break;
		case 6:
			Cart.addCart("Fujifilm X-E3",92665);
			break;
		case 7:
			Electronics.getElectronics();
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
				getCamera();
				break;
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			getCamera();
			
		}
		
	}
}
