package forEachMethod;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(12); l.add(23); l.add(45); l.add(20); l.add(30); l.add(35); l.add(54); l.add(39); l.add(78); l.add(71);
		
		l.forEach(n -> {
			
			if(isPrime(n)) {
				System.out.println(n);
			}
		});
	}	
		
		public static boolean isPrime(int num) {
			
			if(num < 2) {
				return false;
			}
			
			for(int i = 2; i <= num/2; i++) {
				
				if(num % i == 0) {
					return false;
				}
			}
			return true;
		}
		
		
	

}
