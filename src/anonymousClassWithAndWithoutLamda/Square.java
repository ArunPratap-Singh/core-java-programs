package anonymousClassWithAndWithoutLamda;

public class Square implements NumberOperation{
	
	@Override
	public void get(int n) {
		
		System.out.println(n+ " Square is: " +n*n);
	}

}
