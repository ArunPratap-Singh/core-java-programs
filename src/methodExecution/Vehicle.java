package methodExecution;

public class Vehicle {

	
	public static void start() {
		
		System.out.println("Start Vehicle");
		
	}
	public static void main(String[] args) {
		System.out.println("Main Method Start");
		
		start();
		Vehicle p = new Vehicle();
		p.drive();
		p.start();
		Vehicle.start();
		
		System.out.println("Main Method End");
	}
	
	public void drive() {
		
		System.out.println("Drive Vehicle");
			
	}

	

}
