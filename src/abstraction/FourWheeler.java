package abstraction;

public abstract class FourWheeler extends Vehicle {
	
	int numberOfWheels;
	
	FourWheeler(){
		
	}
	
	FourWheeler(String name, int price, String color, int numberOfWheels){
		
		super(name, price, color);
		this.numberOfWheels = numberOfWheels;
	}
	
	public abstract void openDoor();
	
	public abstract void closeDoor();
	
	public String toString() {
		
		return super.toString() + "\n Number of Wheels is : " + numberOfWheels;
	}
	
	

}
