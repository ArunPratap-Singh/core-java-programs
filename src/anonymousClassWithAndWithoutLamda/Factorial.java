package anonymousClassWithAndWithoutLamda;

public class Factorial implements NumberOperation{
	
	@Override
	public void get(int n) {
		
		int fact = 1;
		
		for(int i=1; i <= n; i++) {
			
			fact = fact * i;
		}
		System.out.println(n+" factorial is: " +fact);
	}

}
