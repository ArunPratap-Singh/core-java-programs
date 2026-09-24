package streamAPI;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySorted1 {

	public static void main(String[] args) {
		
		int[] a = {12, 20, 12, 30, 44, 30, 20, 25, 31, 35, 63};
		
		Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).forEach(n->System.out.print(n+" "));

	}

}
