package anonymousClassWithAndWithoutLamda;

public class SumOfDigit implements NumberOperation{
	
	@Override
	public void get(int n) {
		
		int sum = 0;
		 while(n > 0) {
			 
			 int digit = n % 10;
			 sum = sum + digit;
			 
			 n/=10;
		 }
		 System.out.println("Sum is: " +sum);
	}

}
