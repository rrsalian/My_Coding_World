package rakshith;

import java.util.concurrent.SynchronousQueue;

public class BestSortingArray {

	public static void main(String[] args) {
		
		int a[]= {6,5,4,3,77,2,1};
		int b[]=countingSort(a);
		for(int i:b) {
			System.out.println(i);
		}

	}



	static int[] countingSort(int[] numbers) {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}
		
		//System.out.println(max);

		int[] sortedNumbers = new int[max+1];

		for (int i = 0; i < numbers.length; i++) {
			sortedNumbers[numbers[i]]++;
			System.out.println("##############");
			System.out.println(i);
			System.out.println(numbers[i]);
			System.out.println(sortedNumbers[i]);
			System.out.println("##############");
		}
		
		System.out.println("**********************");
		for(int i:sortedNumbers) {
			System.out.println(i);
		}
		System.out.println("**********************");

		int insertPosition = 0;

		for (int i = 0; i <= max; i++) {
			for (int j = 0; j < sortedNumbers[i]; j++) {
				numbers[insertPosition] = i;
				insertPosition++;
			}
		}
		return numbers;
	}
}