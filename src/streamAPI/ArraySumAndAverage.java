package streamAPI;

import java.util.Arrays;


public class ArraySumAndAverage {

	public static void main(String[] args) {
		
		int[] a = {12, 20, 12, 30, 44, 30, 20, 25, 31, 35, 63};
		
		double average = Arrays.stream(a).average().getAsDouble();
		
		int sum = Arrays.stream(a).sum();
		
		System.out.println("Sum is: " +sum);
		System.out.println("===============");
		System.out.println("Average is: " +average);

	}

}
