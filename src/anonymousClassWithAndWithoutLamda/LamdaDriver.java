package anonymousClassWithAndWithoutLamda;

public class LamdaDriver {

	public static void main(String[] args) {
	
		NumberOperation cube = (int n) -> System.out.println(n+ " cube is: " + n*n*n);
		NumberOperation factorial = (int n) -> {
				
				int fact = 1;
				
				for(int  i = 1; i <= n; i++) {
					
					fact = fact * i;
				}
				System.out.println(n+ " Factorial is: " +fact);
				
			
		};
		
		NumberOperation getdigit = (int n) -> {
			
			int num = n % 10;
			System.out.println("Last Digit is: " +num);
		};
		
		NumberOperation printrighttoleft = (int n) -> {
			
			while(n > 0) {
				
				int digit = n % 10;
				
				System.out.println("Digit is: " +digit);
				n/=10;
			}
		};
		
		NumberOperation productofdigit = (int n) -> {
			
			int product = 1;
			
			while(n > 0) {
				
				int digit  = n % 10;
				product = product * digit;
				
				n/=10;
			}
			System.out.println("Product of digit is: " +product );
		};
		
		NumberOperation removedigit = (int n) -> {
			
			int num = n/10;
			System.out.println("Number after removing digit is: " +num);
		};
		
		NumberOperation square = (int n) -> System.out.println(n+ " Square is: " +n*n);
		NumberOperation sumofdigit = (int n) -> {
			
			int sum = 0;
			
			while(n > 0) {
				
				int digit  = n % 10;
				sum = sum + digit;
				
				n/=10;
			}
			System.out.println("Sum of digit is: " +sum);
		};
		
		cube.get(15);
		factorial.get(15);
		getdigit.get(265);
		printrighttoleft.get(654);
		productofdigit.get(895);
		removedigit.get(564);
		square.get(15);
		sumofdigit.get(896);
		

	}

}
