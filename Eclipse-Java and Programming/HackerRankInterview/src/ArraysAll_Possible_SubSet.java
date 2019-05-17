import java.util.ArrayList;
import java.util.List;

public class ArraysAll_Possible_SubSet {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4};
		subsets(arr);

	}
	
	public static void subsets(int arr[]) {
		
		List<List <Integer>> l=new ArrayList<>();
		l.add(new ArrayList());
		for(int i:arr) {
			
			int size=l.size();
			for(int j=0;j<size;j++) {
				List temp=new ArrayList<>(l.get(j));
				temp.add(i);
				l.add(temp);
			}
			
		}
		
		System.out.println(l);
		
	}
	
	
	
}
