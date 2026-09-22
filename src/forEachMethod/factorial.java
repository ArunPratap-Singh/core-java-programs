package forEachMethod;

import java.util.ArrayList;
import java.util.List;

public class factorial {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>(); 
		
		l.add(5); l.add(3); l.add(4); l.add(6); 
		
		l.forEach(n -> { 
			
			int original = n; 
			int factorial = 1; 
			
			while (n > 0) { 
				
				factorial = factorial * n; 
				n--; 
				
			} 
			
			System.out.println("Factorial of " + original + " is: " + factorial);
		});
	}

}
