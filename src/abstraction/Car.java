package abstraction;

public class Car extends FourWheeler {
	
	int numberofdoors;

	Car(){
		
	}
	
	Car(String name, int price, String color, int numberOfWheels, int numberofdoors){
		
		super(name, price, color, numberOfWheels);
		this.numberofdoors = numberofdoors;
	}
	
	public void start() {
		
		System.out.println("Car has been started");
	}
	
	public void drive() {
		
		System.out.println("We are driving the Car");
		System.out.println("It is running smoothly");
	}
	
	public void stop() {
		
		System.out.println("Car stopped safely");
	}
	
	public void openDoor() {
		
		System.out.println("Car door is opening");
	}
	
	public void closeDoor() {
		
		System.out.println("Car door is closing");
	}
	
	public String toString() {
		
		return super.toString() + "\n Number of Doors is : " + numberofdoors;
	}

}
