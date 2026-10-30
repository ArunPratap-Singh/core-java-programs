package interfaceProgram.VehicleManagementSystem;

public interface Vehicle {
	
	void start();
	
	void stop();
	
	void brake();
	
	void accelerate();
	
	double fuelUsed(double distance);
	
	double mileage();
	
	void displayDetails();
	
	default void honk() {
		System.out.println("Vehicle is Honking");
	}
	
	static void info() {
		System.out.println("Welcome to Vehicle Management System");
	}

}
