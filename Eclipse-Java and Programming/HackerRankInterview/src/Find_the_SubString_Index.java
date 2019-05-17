import java.util.Scanner;

public class Find_the_SubString_Index {
	
	public static void main(String[] args) {
		
		//abcdefghi
		//efg
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Strint");
		String str=sc.next();
		System.out.println("Enter the Substring");
		String sub=sc.next();
		
		int index=subStringIndex(str,sub);
		System.out.println();
	
	}
	
	public static int subStringIndex(String str, String sub) {
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<sub.length();j++) {
				if(str.charAt(i)==sub.charAt(j)) {
					
				}
			}
		}
		return 0;
	}

}
