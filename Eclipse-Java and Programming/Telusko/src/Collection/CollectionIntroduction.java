package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection c=new ArrayList();
		
		c.add(2);
		c.add(4);
		c.add(7);
		
		Iterator i=c.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		System.out.println();
		
		for(Object o:c) {
			System.out.print(o+" ");
			
		}
		

	}

}
