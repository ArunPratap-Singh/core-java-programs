package abstraction;

public abstract class Vehicle {
	
	String name;
	int price;
	String color;
	
	Vehicle(){
		
	}
	
	Vehicle(String name, int price, String color){
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public abstract void start();
	
	public abstract void drive();
	
	public abstract void stop();
	
	public String toString() {
		
		return "Name is : " + name + "\n Price is : " + price + "\n Color is: " + color;
	}

}
