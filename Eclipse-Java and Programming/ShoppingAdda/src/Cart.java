import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cart {
	static ArrayList a=new ArrayList();
	public static void addCart(String Name,int Rate) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the Quantity");
		System.out.println();
		int Qty;
		Qty=sc.nextInt();
		System.out.println(Qty +" Item Added to Cart");
		System.out.println();
		a.add(Name);
		a.add(Qty);
		a.add(Rate);
		Main.category();
	}
	public static void ext() {
		System.out.println("\n\n\n\n\n\n");
		if(a.size()>0) {
			int total=0;
			int Qty=0;
			System.out.println("*************************************************************************************************************");
			System.out.println("***************************************     ShoppingAdda Bill   *********************************************");
			System.out.println("*************************************************************************************************************");
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println();
			Date date =new Date();
			SimpleDateFormat ft = new SimpleDateFormat ("E dd.MM.YYYY '                                             ' hh:mm:ss a zzz"); 
			System.out.println( ft.format(date));
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.printf("%-8s %-40s %-8s %-8s %-8s\n", "SI.No", "Item","Qty","Cost","Total");
			System.out.println();
			int j=1;
			for(int i=0;i<a.size();i++) {
				int t1=(int) a.get(i+1);
				int t2=(int) a.get(i+2);

				total+=(t1*t2);
				Qty+=t1;
				System.out.printf("%-8s %-40s %-8s %-8s %-8s\n",(j),a.get(i),a.get(i+1),a.get(i+2),(t1*t2));
				i++;
				i++;
				j++;
			}
			float cgst=total*(9f/100f);
			float sgst=total*(9f/100f);
			System.out.println();
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.printf("%s %-38s %s","Total Qty:","",Qty);
			System.out.println();
			System.out.printf("%s %-54s %s","Sub Total:","",total);
			System.out.println();
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.printf("%s %-55s %s","CGST @9%:","",cgst);
			System.out.println();
			System.out.printf("%s %-55s %s","SGST @9%:","",sgst);
			System.out.println();
			System.out.printf("%s %-54s %s","Total GST:","",cgst+sgst);
			System.out.println();
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.printf("%s %-52s %s","Grand Total:","",(float)(total+sgst+cgst));
			System.out.println();
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println("                                  Thank you for Coming");
			System.out.println("                                  Review us on Google and Facebook");
			System.out.println("                                  Have a Nice Day !");
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
             return;
		}
		else {
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.println("***********************************          Thak You , Visit Again        **********************************");
			System.out.println();
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

		}
	}
	public static void viewCart() {
		Scanner sc=new Scanner(System.in);
		
		if(a.size()>0) {
			System.out.printf("%-8s %-40s %-8s %-8s %-8s\n", "SI.No", "Item","Qty","Cost","Total");
			System.out.println();
			int j=1;
			for(int i=0;i<a.size();i++) {
				int t1=(int) a.get(i+1);
				int t2=(int) a.get(i+2);

				System.out.printf("%-8s %-40s %-8s %-8s %-8s\n",(j),a.get(i),a.get(i+1),a.get(i+2),(t1*t2));
				i++;
				i++;
				j++;
			}
			System.out.println();
			 System.out.println("Do you want to remove from Cart? Y/N");
				char choice=sc.next().charAt(0);
				if(choice=='Y'||choice=='y') {
					 System.out.println("\n");
					removeCart();
				}
				else if(choice=='N'||choice=='n'){
					Main.category();
				}
				else {
					System.out.println("\n\n");
					System.out.println("Enter the valid input");
					System.out.println();
					viewCart();
				}
			}
		else {
			System.out.println("0 item in the Cart");
			System.out.println();
			System.out.println("$$$$$$");
			Main.category();
		}
	
		System.out.println("\n"); 
		
		
	}
 
	 public static void removeCart() {
		
		int count=a.size()/3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the SI.No of item to be removed");
		try {
		int choice=sc.nextInt();
		if(choice<=count&&choice>0) {
			choice=(choice-1)*3;
			a.remove(choice);
			a.remove(choice);
			a.remove(choice);
			System.out.println("/n");
			Main.category();
		}
		else {
			System.out.println("\n");
			System.out.println("Enter a valid input");
			System.out.println();
			removeCart();
		}
		}
		catch(InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter a valid input");
			System.out.println();
			removeCart();
		}
     }
}
