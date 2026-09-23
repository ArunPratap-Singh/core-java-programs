package streamAPI;

import java.util.Arrays;

public class ArrayOdd {

	public static void main(String[] args) {
	
		int[] a = {12, 20, 12, 30, 44, 30, 20, 25, 31, 35, 63};
		
		Arrays.stream(a).filter(n->n%2!=0).forEach(n->System.out.println(n+" "));

	}

}
