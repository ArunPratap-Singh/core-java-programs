package streamAPI;

import java.util.Arrays;

public class ArrayDistinctSum {

	public static void main(String[] args) {
		
		int[] a = {12, 20, 12, 30, 44, 30, 20, 25, 31, 35, 63};
		
		double sum = Arrays.stream(a).mapToDouble(n->n).distinct().sum();
		
		System.out.println("Distinct Sum is: "+sum);

	}

}
