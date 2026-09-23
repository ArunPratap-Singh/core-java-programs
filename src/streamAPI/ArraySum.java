package streamAPI;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		
		int[] a = {12, 20, 12, 30, 44, 30, 20, 25, 31, 35, 63};
		
		int sum = Arrays.stream(a).sum();
		
		System.out.println("Sum is: " +sum);

	}

}
