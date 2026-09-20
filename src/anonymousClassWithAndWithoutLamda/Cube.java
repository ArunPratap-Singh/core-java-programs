package anonymousClassWithAndWithoutLamda;

public class Cube implements NumberOperation{
	
	@Override
	public void get(int n) {
		
		System.out.println(n+ " Cube is: " +n*n*n);
	}

}
