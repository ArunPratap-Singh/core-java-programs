package anonymousClassWithAndWithoutLamda;

public class ProductOfDigit implements NumberOperation{
	
	@Override
	public void get(int n) {
		
		int product = 1;
		
		while(n > 0) {
			
			int digit = n % 10;
			
			product = product * digit;
			
			n/=10;
		}
		System.out.println("Product is: " +product);
	}

}
