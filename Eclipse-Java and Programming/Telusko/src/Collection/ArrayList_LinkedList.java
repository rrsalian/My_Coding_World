package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_LinkedList {

	public static void main(String[] args) {
		
		
		List<Integer> a=new ArrayList<>();
		
		LinkedList<Integer> l=new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		
		
		System.out.println(l.pop());
		
		System.out.println(l);
		
		for (Integer i:l) {
			System.out.println(i);
		}
		l.push(55);
		
		for (Integer i:l) {
			System.out.println(i);
		}
		
	
		
		System.out.println();
		
		
		
		//ArrayList is slow and inefficient when adding value inbetween and delete form ramdom position
		//ArrayList is fast when accessing the element because it has index so we can easly fetch 
		
	}

}
