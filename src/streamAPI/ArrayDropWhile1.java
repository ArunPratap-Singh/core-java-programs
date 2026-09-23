package streamAPI;

import java.util.Arrays;

public class ArrayDropWhile1 {

	public static void main(String[] args) {
		
		int[] a = {12, 20, 12, 30, 44, 30, 20, 25};
		
		Arrays.stream(a).dropWhile(n->n<=20).forEach(n-> System.out.print(n+" "));
		
		
	}

}
