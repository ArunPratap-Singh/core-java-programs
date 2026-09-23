package streamAPI;

import java.util.Arrays;

public class ArrayDistinctAverage {

	public static void main(String[] args) {
		
		int[] a = {12, 20, 12, 30, 44, 30, 20, 25, 31, 35, 63};
		
		double avg = Arrays.stream(a).mapToDouble(n->n).distinct().average().getAsDouble();
		
		System.out.println("Average is: " +avg);

	}

}
