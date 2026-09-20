package anonymousClassWithAndWithoutLamda;

public class AnonymousClassDriver {

	public static void main(String[] args) {
		
		NumberOperation cube = new NumberOperation() {
			
			@Override
			public void get(int n) {
				
			System.out.println(n+ " cube is: " +n * n * n);	
				
			}
		};
		
		NumberOperation factorial = new NumberOperation() {
			
			@Override
			public void get(int n) {
				
				int fact = 1;
				
				for(int  i = 1; i <= n; i++) {
					
					fact = fact * i;
				}
				System.out.println("Factorial is: " +fact);
				
			}
		};
		
		NumberOperation getdigit = new NumberOperation() {
			
			@Override
			public void get(int n) {
				
				int num = n % 10;
				System.out.println("Last Digit is: " +num);
				
			}
		};
		
		NumberOperation printrighttoleft = new NumberOperation() {
			
			@Override
			public void get(int n) {
			
				while(n > 0) {
					
					int digit = n % 10;
					
					System.out.println("Digit is: " +digit);
					
					n/=10;
				}
				
			}
		};
		
		NumberOperation productofdigit = new NumberOperation() {
			
			@Override
			public void get(int n) {
				
				int product = 1;
				
				while(n > 0) {
					
					int digit  = n % 10;
					product = product * digit;
					
					n/=10;
				}
				System.out.println("Product of digit is: " +product );
				
			}
		};
		
		NumberOperation removedigit = new NumberOperation() {
			
			@Override
			public void get(int n) {
				
				int num = n/10;
				System.out.println("Number After digit removed is: " +num);
				
			}
		}; 
		
		NumberOperation square = new NumberOperation() {
			
			@Override
			public void get(int n) {
				
				System.out.println(n+ " square is: " +n * n);
				
			}
		};
		
		NumberOperation sumofdigit = new NumberOperation() {
			
			@Override
			public void get(int n) {
				
				int sum = 0;
				
				while(n > 0) {
					
					int digit = n % 10;
					sum = sum + digit;
					
					n/=10;
				}
				System.out.println("Sum of digit is: " +sum);
				
			}
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
