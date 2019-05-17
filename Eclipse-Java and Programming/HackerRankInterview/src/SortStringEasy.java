import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SortStringEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="asdfghjklasf";
		
		Set<Character> se=new LinkedHashSet<>();
		for(char i:s.toCharArray()) {
			se.add(i);
		}
		s=se.toString();
		System.out.println(s);
		s=s.replaceAll(" ", "");
		s=s.replace(",", "");
		s=s.replace("[", "");
		s=s.replace("]", "");
		char a[]=s.toCharArray();
		Arrays.sort(a);
		String b=new String(a);
		System.out.println(b);

	}

}
