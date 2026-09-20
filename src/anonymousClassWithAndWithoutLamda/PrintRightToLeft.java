package anonymousClassWithAndWithoutLamda;

public class PrintRightToLeft implements NumberOperation{
	
	@Override
	public void get(int n) {
		
		while(n > 0) {
			
			int digit = n % 10;
			
			System.out.println("Digit is: " +digit);
			
			n/=10;
		}
	}

}
