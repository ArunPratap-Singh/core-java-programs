package lamdaExpression.PrimeNumber;

public class LamdaClass {

	public static void main(String[] args) {
		
		CheckPrimeNumber prime = (int number) -> {
			
			if(number < 2)
				return false;
			
			for(int i = 2; i <= number/2; i++) {
				
				if(number % i == 0) {
					return false;
				}
			}
			return true;
		};
		
		boolean result = prime.checkPrime(17);

        System.out.println("Is Prime: " + result);

	}

} 
