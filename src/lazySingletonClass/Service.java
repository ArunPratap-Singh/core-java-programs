package lazySingletonClass;

public class Service {
	
	private static Service s;
	
	
	private Service() {
		
	}
	
	public static Service getInstance() {
		
		if(s == null) {
			s = new Service();
		}
		
		return s;
	}
	
	public void service() {
		
		System.out.println(" Service is running");
		System.out.println(" Service is walking");
	}

}
