package streamAPI;

import java.util.Arrays;

public class ArrayDistinct1 {

	public static void main(String[] args) {
		
		int[] a = {12, 20, 12, 30, 44, 30, 20, 25};
		
		a= Arrays.stream(a).distinct().toArray();
		
		for(int n : a) {
			System.out.print(n+" ");
		}

	}

}
