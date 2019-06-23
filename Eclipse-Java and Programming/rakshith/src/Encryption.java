import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Enter the key");
		int k=sc.nextInt();
		
		k=(k>=26)?k-26:k;
		//System.out.println(s +" "+k);

		String t="";
		for(int i=0;i<s.length();i++) {


			if(s.charAt(i)>=65 && s.charAt(i)<=(90)) {
				if(s.charAt(i)>=65 && s.charAt(i)<=(90-k)) {
					t+=(char)(s.charAt(i)+k);
				}
				else {
					t+=(char)(65+k-(90-s.charAt(i)-1));
				}
			}

			if(s.charAt(i)>=97 && s.charAt(i)<=(122)) {
				if(s.charAt(i)>=97 && s.charAt(i)<=(122-k)) {
					t+=(char)(s.charAt(i)+k);
				}
				else {
					t+=(char)(97+k-(122-s.charAt(i)-1));
				}
			}

			if(s.charAt(i)>=48 && s.charAt(i)<=(57)) {
				if(s.charAt(i)>=48 && s.charAt(i)<=(57-k)) {
					t+=(char)(s.charAt(i)+k);
				}
				else {
					t+=(char)(48+k-(57-s.charAt(i)-1));
				}
			}
		}

		System.out.println(t);

	}

}
