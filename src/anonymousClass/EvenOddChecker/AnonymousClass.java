package anonymousClass.EvenOddChecker;

public class AnonymousClass {

	public static void main(String[] args) {
		
		EvenOddChecker evenodd = new EvenOddChecker() {
			
			@Override
			public void odd(int n) {
				
				while(n > 0) {
					
					int digit = n % 10;
					
					if(digit % 2 == 0)
						System.out.println("Even Digit is: " +digit);
					n/=10;
				}
				
			}
			
			@Override
			public void even(int n) {
				
				while(n > 0) {
					
					int digit = n % 10;
					
					if(digit % 2 != 0)
						System.out.println("Odd Digit is: " +digit);
					n/=10;
				
				}
			}
		};
		
	evenodd.even(123456);
	System.out.println("==================");
	evenodd.odd(1234567);
	}

}
