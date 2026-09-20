package anonymousClassWithAndWithoutLamda;

public class RemoveDigit implements NumberOperation{
	
	@Override
	public void get(int n) {
		
		int num = n/10;
		
		System.out.println("Number After Removing Digit is: " +num);
	}

}
