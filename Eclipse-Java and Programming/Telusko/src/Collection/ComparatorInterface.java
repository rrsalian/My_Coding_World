package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
	public static void main(String[] args) {

		List<Integer> c=new ArrayList<>();

		c.add(961);
		c.add(212);
		c.add(435);
		c.add(723);

//For Sort Collection.....****************************************************************************
				Collections.sort(c);
				for (int o:c) {
					System.out.print(o+" ");
				}
				System.out.println();



//Sort using comparator Interface by considering last 2 digit..***********************************************
				Comparator<Integer> com=(a,b)-> {
					
					return a%100>b%100?1:-1;
				};
		
				Collections.sort(c,com);
				for (int o:c) {
					System.out.print(o+" ");
				}
				System.out.println();

	
//Using Lambda Expression sort by last digit..**************************************************************
				Collections.sort(c,(a,b) ->{
					return a%10>b%10?1:-1;
				});
				for (int o:c) {
					System.out.print(o+" ");
				}


	}
}
