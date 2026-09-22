package forEachMethod;

import java.util.ArrayList;
import java.util.List;

public class SumOfEven {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>(); 
		l.add(12); l.add(23); l.add(45); l.add(20); l.add(30); l.add(35); l.add(54); l.add(39); l.add(78); l.add(71); 
		
		final int[] sum = {0};
		
		l.forEach(n -> { 
			
			if (n % 2 == 0) { 
				
				sum[0] = sum[0] + n; 
				
			} 
			
		}); 
		
		System.out.println("Sum of even numbers: " + sum[0]);
		

	}

}
