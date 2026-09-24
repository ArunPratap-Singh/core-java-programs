package streamAPI;

import java.util.Arrays;

public class ArraySorted2 {

	public static void main(String[] args) {
		
		int[] a = {12, 20, 12, 30, 44, 30, 20, 25, 31, 35, 63};
		
		Arrays.stream(a).boxed().sorted((n1,n2)->n2-n1).forEach(n->System.out.print(n+" "));

	}

}
