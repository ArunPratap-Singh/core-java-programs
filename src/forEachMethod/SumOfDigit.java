package forEachMethod;

import java.util.ArrayList;
import java.util.List;

public class SumOfDigit {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>(); 
		l.add(12); l.add(23); l.add(45); l.add(20); l.add(30); l.add(35); l.add(54); l.add(39); l.add(78); l.add(71);
		
		l.forEach(n -> {
			
			int sum = 0;
			int original = n;
			 while(n > 0) {
				 
				 int digit = n % 10;
				 sum = sum + digit;
				 
				 n/=10;
			 }
			 System.out.println("Sum of digits of " +original+ " is : " +sum);
		});

	}

}
