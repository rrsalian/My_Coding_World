import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("\n");
		System.out.println("*************************************************************************************************************");
		System.out.println("**********************************            ShoppingAdda          *****************************************");
		System.out.println("*************************************************************************************************************");

		System.out.println("\n\n");
		String name;
		boolean isTrue;
		//Name
		do {
			isTrue=false;
			System.out.print("Enter The Name   : ");
			name=sc.nextLine();
			for(int i=0;i<name.length();i++) {
				if((name.charAt(i)>=65&&name.charAt(i)<=90)||(name.charAt(i)>=97&&name.charAt(i)<=122) || name.charAt(i)==' ') {
				}
				else {
					isTrue=true;
				}
			}
			if(isTrue==true) {
				System.out.println();
				System.out.println("***Enter a valid User Name***");
			}
		}while(isTrue==true);
		System.out.println();

		//Number
		do {
			isTrue=false;
			System.out.print("Enter The Mob.Num: ");
			String num=sc.nextLine();
			if(num.length()==10) {
				for(int i=0;i<num.length();i++) {
					if(num.charAt(i)>=48&&num.charAt(i)<=57) {
					}
					else {
						isTrue=true;
					}
				}
			}
			else {
				isTrue=true;
			}
			if(isTrue==true) {
				System.out.println();
				System.out.println("***Enter a valid Mobile Number***");
			}
		} while(isTrue==true);
		System.out.println("\n\n");
		//Date and time
		Date date =new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("E dd.MM.YYYY '                                          ' hh:mm:ss a zzz"); 
		System.out.println( ft.format(date));
		System.out.println("\n");
		System.out.println("Welcome to ShoppingAdda, "+name);
		System.out.println();
		category();
		
	}
	public static void category() {
		
		System.out.println("############    Shopping Category    ############");
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("1. Fashion");
		System.out.println("2. Electronics");
		System.out.println("3. Books");
		System.out.println("4. Home and Kitchen Appliances");
		System.out.println("5. Shoes");
		System.out.println("6. View Cart");
		System.out.println("7. Exit");
		System.out.println("Enter the choice");
		try {
		choice=sc.nextInt();
		System.out.println();
		switch (choice) {
		case 1:
			Cloth.getCloth();
			break;
		case 2:
			Electronics.getElectronics();
			break;
		case 3:
			Books.getBooks();
			break;
		case 4:
			Home.getHome();
			break;
		case 5:
			Shoe.getShoes();
			break;
		case 6:
			System.out.println("\n\n\n");
			Cart.viewCart();
			break;
		case 7:
			Exit.getExit();
			break;
		default:
			System.out.println("\n");
			System.out.println("Ente Valid Choice");
			System.out.println();
			category();
			break;
		}
		}
		catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter the valid input");
			System.out.println();
			category();
			
		}	
	}
}
