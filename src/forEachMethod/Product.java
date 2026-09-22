package forEachMethod;

import java.util.ArrayList;
import java.util.List;

public class Product {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>(); 
		
		l.add(2); l.add(3); l.add(4); l.add(5); 
		
		final int[] product = {1}; 
		
		l.forEach(n -> { 
			
			product[0] = product[0] * n; 
			
		}); 
		System.out.println("Product of all numbers: " + product[0]);
	}

}
