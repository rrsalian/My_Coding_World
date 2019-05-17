import java.util.Scanner;

public class BankTransaction {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Total No of Persons
		System.out.println("Enter the Total No of Person");
		int Persons=sc.nextInt();
		//Name of Each Persons
		System.out.println("Enter the Name of Each Person");
		String Name[]=new String[Persons];
		for(int i=0;i<Name.length;i++) {
			Name[i]=sc.next();
		}
		//Total Number of Transaction
		System.out.println("Enter the No of Transaction made");
		int Transaction=sc.nextInt();
		//Sender's Name
		System.out.println("Enter the Sender's Names");
		String Sender[]=new String[Transaction];
		for(int i=0;i<Transaction;i++) {
			Sender[i]=sc.next();
		}
		//Recevier's Name
		System.out.println("Enter the Recevier's Names");
		String Receiver[]=new String[Transaction];
		for(int i=0;i<Transaction;i++) {
			Receiver[i]=sc.next();
		}
		//Transaction Amount
		System.out.println("Enter the transaction Ammount");
		int Amount[]=new int[Transaction];
		for(int i=0;i<Transaction;i++) {
			Amount[i]=sc.nextInt();
		}
		
		int Balance[]=new int[Transaction];
		
		//Function Call
		Balance=Bank(Persons,Name,Transaction,Sender,Receiver,Amount);
		
		for(int i=0;i<Balance.length;i++) {
			System.out.println(Balance[i]);
		}
		
		
	}
	
	public static int[] Bank(int a1,String a2[],int a3,String a4[],String a5[],int a6[]) {
		
		int Balance[]=new int[a1];
		
		//Sender Transaction
		for(int i=0;i<a4.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a4[i].equals(a2[j])) {
					Balance[j]-=a6[i];
				}
			}
		}
		
		//Receiver Transaction
		for(int i=0;i<a5.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a5[i].equals(a2[j])) {
					Balance[j]+=a6[i];
				}
			}
		}
		
		return Balance;
	}
}
