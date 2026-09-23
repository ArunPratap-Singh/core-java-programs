package streamAPI;

import java.util.Arrays;

public class ArraySkipFirst {

	public static void main(String[] args) {
		
		int[] a = {12, 20, 12, 30, 44, 30, 20, 25, 31, 35, 63};
		
		int FirstElement = Arrays.stream(a).skip(5).findFirst().getAsInt();
		
		System.out.println("First Element After Skip is: " +FirstElement);

	}

}
