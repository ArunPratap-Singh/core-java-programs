package anonymousClassWithAndWithoutLamda;

public class GetDigit implements NumberOperation{
	
	@Override
	public void get(int n) {
		
		int num = n % 10;
		System.out.println("Last Digit is: " +num);
	}

}
