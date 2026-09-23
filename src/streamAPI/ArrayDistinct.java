package streamAPI;

import java.util.Arrays;

public class ArrayDistinct {

	public static void main(String[] args) {
		
		int[] a = {12, 20, 12, 30, 44, 30, 20, 25};
		
		Arrays.stream(a).distinct().forEach(n-> System.out.println(n+"\n"));
		
		
	}

}
