package eagerSingletonClass;

public class Service {
	
	private static Service s = new Service();
	
	
	private Service() {
		
	}
	
	public static Service getInstance() {
		
		return s;
	}
	
	public void service() {
		
		System.out.println(" Service is running");
		System.out.println(" Service is walking");
	}

}
