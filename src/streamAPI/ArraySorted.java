package streamAPI;

import java.util.Arrays;

public class ArraySorted {

	public static void main(String[] args) {
		
		int[] a = {12, 20, 12, 30, 44, 30, 20, 25, 31, 35, 63};
		
		Arrays.stream(a).sorted().forEach(n->System.out.println(n+" "));

	}

}
