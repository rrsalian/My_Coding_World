package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Set_Interface {
	
	// Set is collection of unique item
	// Duplicates are not allowed in Set
	
	// In Hash Set will not give value in the sequence of you are entered ,it will give in random order
	// if you use TreeSet then it will give in Ascending order

	public static void main(String[] args) {
		
		Set <Integer>s=new HashSet<>();
		System.out.println(s.add(7));
		s.add(5);
		s.add(1);
		s.add(3);
		s.add(5);
		System.out.println(s.add(7));
		
		
		
		
		for(int i:s) {
			System.out.print(i+" ");
		}
		
		
	}

}

